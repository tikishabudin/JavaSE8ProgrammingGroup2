import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import com.lazada.assets.CheckingAccount;

public class Day5NIO2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Path fileLoc = Paths.get("./generated.file");
		Path copyLoc = Paths.get("./copied.file");
		Path moveLoc = Paths.get("./moved.file");
		
		Paths.get("/home/tiki");
		try 
		{
			Stream<Path> paths = Files.walk(Paths.get("/home/tiki/Documents/"));
			paths.forEach((path)->{
				System.out.format("%s - %s\n",path,Files.isDirectory(path));
			});
		} 
		catch (IOException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		if(Files.notExists(fileLoc))
		{
			try 
			{
				Set<PosixFilePermission> perm = new HashSet<>();
				perm.add(PosixFilePermission.OWNER_WRITE);
				perm.add(PosixFilePermission.OWNER_READ);
				perm.add(PosixFilePermission.GROUP_READ);
				perm.add(PosixFilePermission.OTHERS_READ);
				
				FileAttribute<Set<PosixFilePermission>> fa = PosixFilePermissions.asFileAttribute(perm);
				
				//Files.delete(fileLoc);
				Files.createFile(fileLoc,fa);
				
			} 
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			try 
			{
//				Files.copy(fileLoc, 
//						copyLoc, 
//						StandardCopyOption.REPLACE_EXISTING, 
//						StandardCopyOption.ATOMIC_MOVE);
				
				//Files.move(copyLoc,moveLoc);
			} 
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		CheckingAccount obj = new CheckingAccount("John Doe", 9000000000.0);
		ObjectOutputStream oos;
		
		try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(fileLoc));)
		{
//			oos = new ObjectOutputStream(Files.newOutputStream(fileLoc));
//			oos.writeObject(obj);
			CheckingAccount result = (CheckingAccount)ois.readObject();
			System.out.println(result.getHolderName());
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}





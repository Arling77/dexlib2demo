import org.jf.dexlib2.DexFileFactory;
import org.jf.dexlib2.iface.DexFile;

import java.io.File;

// TODO inline class, looks redundant
public class DexlibLoader {
    public static DexFile loadDexFile(File binaryArchiveFile) throws Exception {
        // TODO optimize
        DexFile newDexFile = DexFileFactory.loadDexFile(binaryArchiveFile,null);

        return newDexFile;
    }
}
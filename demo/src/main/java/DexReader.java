import org.jf.dexlib2.DexFileFactory;
import org.jf.dexlib2.Opcodes;
import org.jf.dexlib2.iface.ClassDef;
import org.jf.dexlib2.iface.DexFile;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DexReader {
    public static List<String> readClassNamesFromDex(File binaryArchiveFile) throws Exception {
        DexFile dexFile = DexFileFactory.loadDexFile(binaryArchiveFile,null);
        List<String> result = new ArrayList();
        for (ClassDef classDef : dexFile.getClasses()) {
            result.add(classDef.getType().replaceAll("/", ".").substring(1, classDef.getType().length() - 1));
        }
        Collections.sort(result);
        return result;
    }
}

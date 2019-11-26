import org.jf.dexlib2.DexFileFactory;
import org.jf.dexlib2.Opcodes;
import org.jf.dexlib2.iface.ClassDef;
import org.jf.dexlib2.iface.DexFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        DexFile dexFile = null;
        try {
            dexFile = DexFileFactory.loadDexFile("classes.dex",Opcodes.getDefault());
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (ClassDef classDef: dexFile.getClasses()) {
            System.out.println(classDef.getFields());
        }


    }
}

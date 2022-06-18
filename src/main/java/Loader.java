import org.objectweb.asm.ClassReader;
import uwu.narumi.deobfuscator.Deobfuscator;
import uwu.narumi.deobfuscator.transformer.composed.BozoriuszTransformer;

import java.nio.file.Path;

public class Loader {

    public static void main(String... args) throws Exception {
        Deobfuscator.builder()
                .input(Path.of("test", "XD.jar"))
                .output(Path.of("test", "XD-deobf.jar"))
                .transformers(
                        new BozoriuszTransformer()
                )
                .classReaderFlags(ClassReader.SKIP_FRAMES)
                .classWriterFlags(0)
                .consoleDebug()
                .build()
                .start();

    }
}
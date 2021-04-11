// Targeted by JavaCPP version 1.5.5: DO NOT EDIT THIS FILE

package org.bytedeco.opencl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.opencl.global.OpenCL.*;


// #endif

/* Context APIs */
@Properties(inherit = org.bytedeco.opencl.presets.OpenCL.class)
public class Pfn_notify_BytePointer_Pointer_long_Pointer extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Pfn_notify_BytePointer_Pointer_long_Pointer(Pointer p) { super(p); }
    protected Pfn_notify_BytePointer_Pointer_long_Pointer() { allocate(); }
    private native void allocate();
    public native void call(@Cast("const char*") BytePointer errinfo,
                                                @Const Pointer private_info,
                                                @Cast("size_t") long cb,
                                                Pointer user_data);
}
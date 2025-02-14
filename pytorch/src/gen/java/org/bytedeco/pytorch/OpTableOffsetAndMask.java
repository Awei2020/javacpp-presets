// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


@Namespace("c10") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class OpTableOffsetAndMask extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public OpTableOffsetAndMask() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OpTableOffsetAndMask(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OpTableOffsetAndMask(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public OpTableOffsetAndMask position(long position) {
        return (OpTableOffsetAndMask)super.position(position);
    }
    @Override public OpTableOffsetAndMask getPointer(long i) {
        return new OpTableOffsetAndMask((Pointer)this).offsetAddress(i);
    }

  public native @Cast("uint16_t") short offset(); public native OpTableOffsetAndMask offset(short setter);
  public native @Cast("uint16_t") short backend_mask(); public native OpTableOffsetAndMask backend_mask(short setter);
}

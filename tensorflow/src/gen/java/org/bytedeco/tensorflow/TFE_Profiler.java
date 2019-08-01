// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TFE_Profiler extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TFE_Profiler(Pointer p) { super(p); }

  public TFE_Profiler(TFE_ProfilerContext ctx) { super((Pointer)null); allocate(ctx); }
  private native void allocate(TFE_ProfilerContext ctx);

  public native @MoveUniquePtr ProfilerSession profiler(); public native TFE_Profiler profiler(ProfilerSession setter);
}
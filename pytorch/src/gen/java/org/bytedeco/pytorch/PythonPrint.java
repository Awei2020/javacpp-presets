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


@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class PythonPrint extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PythonPrint(Pointer p) { super(p); }

  public PythonPrint(
        @ByRef IValueVector constant_table,
        @ByRef PrintDepsTable deps_table,
        @ByVal(nullValue = "c10::TypePrinter(nullptr)") @Cast("c10::TypePrinter*") Pointer type_printer,
        @Cast("bool") boolean enforce_importable/*=false*/) { super((Pointer)null); allocate(constant_table, deps_table, type_printer, enforce_importable); }
  private native void allocate(
        @ByRef IValueVector constant_table,
        @ByRef PrintDepsTable deps_table,
        @ByVal(nullValue = "c10::TypePrinter(nullptr)") @Cast("c10::TypePrinter*") Pointer type_printer,
        @Cast("bool") boolean enforce_importable/*=false*/);
  public PythonPrint(
        @ByRef IValueVector constant_table,
        @ByRef PrintDepsTable deps_table) { super((Pointer)null); allocate(constant_table, deps_table); }
  private native void allocate(
        @ByRef IValueVector constant_table,
        @ByRef PrintDepsTable deps_table);

  public native void printNamedType(@Const @SharedPtr @ByRef NamedType classType);
  public native void printFunction(@Const @ByRef Function callee);
  public native void printMethod(@Const @ByRef Function callee);

  public native @StdString BytePointer str();
  public native @StdVector TaggedRange ranges();
  public native @Cast("uint64_t") long minVersion();
}

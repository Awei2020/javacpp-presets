// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;


@Namespace("arrow::dataset") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class ScanOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ScanOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ScanOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ScanOptions position(long position) {
        return (ScanOptions)super.position(position);
    }

  public ScanOptions() { super((Pointer)null); allocate(); }
  private native void allocate();

  public ScanOptions(@SharedPtr DataSelector selector, @SharedPtr Schema schema,
                @ByVal(nullValue = "std::vector<std::shared_ptr<arrow::dataset::FileScanOptions> >({})") FileScanOptionsVector options) { super((Pointer)null); allocate(selector, schema, options); }
  private native void allocate(@SharedPtr DataSelector selector, @SharedPtr Schema schema,
                @ByVal(nullValue = "std::vector<std::shared_ptr<arrow::dataset::FileScanOptions> >({})") FileScanOptionsVector options);
  public ScanOptions(@SharedPtr DataSelector selector, @SharedPtr Schema schema) { super((Pointer)null); allocate(selector, schema); }
  private native void allocate(@SharedPtr DataSelector selector, @SharedPtr Schema schema);

  public native MemoryPool pool();

  // Filters
  public native @SharedPtr DataSelector selector(); public native ScanOptions selector(DataSelector setter);

  // Schema to which record batches will be reconciled
  public native @SharedPtr Schema schema(); public native ScanOptions schema(Schema setter);

  public native MemoryPool pool_(); public native ScanOptions pool_(MemoryPool setter);

  public native @ByRef FileScanOptionsVector options(); public native ScanOptions options(FileScanOptionsVector setter);
}
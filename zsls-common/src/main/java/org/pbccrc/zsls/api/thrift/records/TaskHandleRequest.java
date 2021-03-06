/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.pbccrc.zsls.api.thrift.records;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-4-6")
public class TaskHandleRequest implements org.apache.thrift.TBase<TaskHandleRequest, TaskHandleRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TaskHandleRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TaskHandleRequest");

  private static final org.apache.thrift.protocol.TField TASK_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("taskInfo", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField TASK_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("taskType", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField RETRY_TASK_FIELD_DESC = new org.apache.thrift.protocol.TField("retryTask", org.apache.thrift.protocol.TType.BOOL, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TaskHandleRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TaskHandleRequestTupleSchemeFactory());
  }

  public TTaskInfo taskInfo; // required
  /**
   * 
   * @see TaskType
   */
  public TaskType taskType; // required
  public boolean retryTask; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TASK_INFO((short)1, "taskInfo"),
    /**
     * 
     * @see TaskType
     */
    TASK_TYPE((short)2, "taskType"),
    RETRY_TASK((short)3, "retryTask");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TASK_INFO
          return TASK_INFO;
        case 2: // TASK_TYPE
          return TASK_TYPE;
        case 3: // RETRY_TASK
          return RETRY_TASK;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __RETRYTASK_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TASK_INFO, new org.apache.thrift.meta_data.FieldMetaData("taskInfo", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TTaskInfo.class)));
    tmpMap.put(_Fields.TASK_TYPE, new org.apache.thrift.meta_data.FieldMetaData("taskType", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TaskType.class)));
    tmpMap.put(_Fields.RETRY_TASK, new org.apache.thrift.meta_data.FieldMetaData("retryTask", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TaskHandleRequest.class, metaDataMap);
  }

  public TaskHandleRequest() {
  }

  public TaskHandleRequest(
    TTaskInfo taskInfo,
    TaskType taskType,
    boolean retryTask)
  {
    this();
    this.taskInfo = taskInfo;
    this.taskType = taskType;
    this.retryTask = retryTask;
    setRetryTaskIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TaskHandleRequest(TaskHandleRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTaskInfo()) {
      this.taskInfo = new TTaskInfo(other.taskInfo);
    }
    if (other.isSetTaskType()) {
      this.taskType = other.taskType;
    }
    this.retryTask = other.retryTask;
  }

  public TaskHandleRequest deepCopy() {
    return new TaskHandleRequest(this);
  }

  @Override
  public void clear() {
    this.taskInfo = null;
    this.taskType = null;
    setRetryTaskIsSet(false);
    this.retryTask = false;
  }

  public TTaskInfo getTaskInfo() {
    return this.taskInfo;
  }

  public TaskHandleRequest setTaskInfo(TTaskInfo taskInfo) {
    this.taskInfo = taskInfo;
    return this;
  }

  public void unsetTaskInfo() {
    this.taskInfo = null;
  }

  /** Returns true if field taskInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetTaskInfo() {
    return this.taskInfo != null;
  }

  public void setTaskInfoIsSet(boolean value) {
    if (!value) {
      this.taskInfo = null;
    }
  }

  /**
   * 
   * @see TaskType
   */
  public TaskType getTaskType() {
    return this.taskType;
  }

  /**
   * 
   * @see TaskType
   */
  public TaskHandleRequest setTaskType(TaskType taskType) {
    this.taskType = taskType;
    return this;
  }

  public void unsetTaskType() {
    this.taskType = null;
  }

  /** Returns true if field taskType is set (has been assigned a value) and false otherwise */
  public boolean isSetTaskType() {
    return this.taskType != null;
  }

  public void setTaskTypeIsSet(boolean value) {
    if (!value) {
      this.taskType = null;
    }
  }

  public boolean isRetryTask() {
    return this.retryTask;
  }

  public TaskHandleRequest setRetryTask(boolean retryTask) {
    this.retryTask = retryTask;
    setRetryTaskIsSet(true);
    return this;
  }

  public void unsetRetryTask() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RETRYTASK_ISSET_ID);
  }

  /** Returns true if field retryTask is set (has been assigned a value) and false otherwise */
  public boolean isSetRetryTask() {
    return EncodingUtils.testBit(__isset_bitfield, __RETRYTASK_ISSET_ID);
  }

  public void setRetryTaskIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RETRYTASK_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TASK_INFO:
      if (value == null) {
        unsetTaskInfo();
      } else {
        setTaskInfo((TTaskInfo)value);
      }
      break;

    case TASK_TYPE:
      if (value == null) {
        unsetTaskType();
      } else {
        setTaskType((TaskType)value);
      }
      break;

    case RETRY_TASK:
      if (value == null) {
        unsetRetryTask();
      } else {
        setRetryTask((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TASK_INFO:
      return getTaskInfo();

    case TASK_TYPE:
      return getTaskType();

    case RETRY_TASK:
      return Boolean.valueOf(isRetryTask());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TASK_INFO:
      return isSetTaskInfo();
    case TASK_TYPE:
      return isSetTaskType();
    case RETRY_TASK:
      return isSetRetryTask();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TaskHandleRequest)
      return this.equals((TaskHandleRequest)that);
    return false;
  }

  public boolean equals(TaskHandleRequest that) {
    if (that == null)
      return false;

    boolean this_present_taskInfo = true && this.isSetTaskInfo();
    boolean that_present_taskInfo = true && that.isSetTaskInfo();
    if (this_present_taskInfo || that_present_taskInfo) {
      if (!(this_present_taskInfo && that_present_taskInfo))
        return false;
      if (!this.taskInfo.equals(that.taskInfo))
        return false;
    }

    boolean this_present_taskType = true && this.isSetTaskType();
    boolean that_present_taskType = true && that.isSetTaskType();
    if (this_present_taskType || that_present_taskType) {
      if (!(this_present_taskType && that_present_taskType))
        return false;
      if (!this.taskType.equals(that.taskType))
        return false;
    }

    boolean this_present_retryTask = true;
    boolean that_present_retryTask = true;
    if (this_present_retryTask || that_present_retryTask) {
      if (!(this_present_retryTask && that_present_retryTask))
        return false;
      if (this.retryTask != that.retryTask)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_taskInfo = true && (isSetTaskInfo());
    list.add(present_taskInfo);
    if (present_taskInfo)
      list.add(taskInfo);

    boolean present_taskType = true && (isSetTaskType());
    list.add(present_taskType);
    if (present_taskType)
      list.add(taskType.getValue());

    boolean present_retryTask = true;
    list.add(present_retryTask);
    if (present_retryTask)
      list.add(retryTask);

    return list.hashCode();
  }

  @Override
  public int compareTo(TaskHandleRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTaskInfo()).compareTo(other.isSetTaskInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTaskInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.taskInfo, other.taskInfo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTaskType()).compareTo(other.isSetTaskType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTaskType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.taskType, other.taskType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRetryTask()).compareTo(other.isSetRetryTask());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRetryTask()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.retryTask, other.retryTask);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TaskHandleRequest(");
    boolean first = true;

    sb.append("taskInfo:");
    if (this.taskInfo == null) {
      sb.append("null");
    } else {
      sb.append(this.taskInfo);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("taskType:");
    if (this.taskType == null) {
      sb.append("null");
    } else {
      sb.append(this.taskType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("retryTask:");
    sb.append(this.retryTask);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (taskInfo == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'taskInfo' was not present! Struct: " + toString());
    }
    if (taskType == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'taskType' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'retryTask' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
    if (taskInfo != null) {
      taskInfo.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TaskHandleRequestStandardSchemeFactory implements SchemeFactory {
    public TaskHandleRequestStandardScheme getScheme() {
      return new TaskHandleRequestStandardScheme();
    }
  }

  private static class TaskHandleRequestStandardScheme extends StandardScheme<TaskHandleRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TaskHandleRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TASK_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.taskInfo = new TTaskInfo();
              struct.taskInfo.read(iprot);
              struct.setTaskInfoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TASK_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.taskType = org.pbccrc.zsls.api.thrift.records.TaskType.findByValue(iprot.readI32());
              struct.setTaskTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RETRY_TASK
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.retryTask = iprot.readBool();
              struct.setRetryTaskIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetRetryTask()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'retryTask' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TaskHandleRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.taskInfo != null) {
        oprot.writeFieldBegin(TASK_INFO_FIELD_DESC);
        struct.taskInfo.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.taskType != null) {
        oprot.writeFieldBegin(TASK_TYPE_FIELD_DESC);
        oprot.writeI32(struct.taskType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(RETRY_TASK_FIELD_DESC);
      oprot.writeBool(struct.retryTask);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TaskHandleRequestTupleSchemeFactory implements SchemeFactory {
    public TaskHandleRequestTupleScheme getScheme() {
      return new TaskHandleRequestTupleScheme();
    }
  }

  private static class TaskHandleRequestTupleScheme extends TupleScheme<TaskHandleRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TaskHandleRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.taskInfo.write(oprot);
      oprot.writeI32(struct.taskType.getValue());
      oprot.writeBool(struct.retryTask);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TaskHandleRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.taskInfo = new TTaskInfo();
      struct.taskInfo.read(iprot);
      struct.setTaskInfoIsSet(true);
      struct.taskType = org.pbccrc.zsls.api.thrift.records.TaskType.findByValue(iprot.readI32());
      struct.setTaskTypeIsSet(true);
      struct.retryTask = iprot.readBool();
      struct.setRetryTaskIsSet(true);
    }
  }

}


/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: G:\\code\\Android\\v2ex-android\\app\\src\\main\\aidl\\com\\yaoyumeng\\v2ex2\\service\\INoticeService.aidl
 */
package com.yaoyumeng.v2ex2.service;
public interface INoticeService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.yaoyumeng.v2ex2.service.INoticeService
{
private static final java.lang.String DESCRIPTOR = "com.yaoyumeng.v2ex2.service.INoticeService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.yaoyumeng.v2ex2.service.INoticeService interface,
 * generating a proxy if needed.
 */
public static com.yaoyumeng.v2ex2.service.INoticeService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.yaoyumeng.v2ex2.service.INoticeService))) {
return ((com.yaoyumeng.v2ex2.service.INoticeService)iin);
}
return new com.yaoyumeng.v2ex2.service.INoticeService.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_scheduleNotice:
{
data.enforceInterface(DESCRIPTOR);
this.scheduleNotice();
reply.writeNoException();
return true;
}
case TRANSACTION_requestNotice:
{
data.enforceInterface(DESCRIPTOR);
this.requestNotice();
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.yaoyumeng.v2ex2.service.INoticeService
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void scheduleNotice() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_scheduleNotice, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void requestNotice() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_requestNotice, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_scheduleNotice = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_requestNotice = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public void scheduleNotice() throws android.os.RemoteException;
public void requestNotice() throws android.os.RemoteException;
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package org.chromium.net:
//            IRemoteAndroidKeyStore, IRemoteAndroidKeyStoreCallbacks

class 
    implements IRemoteAndroidKeyStore
{

    private IBinder a;

    public String a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        String s;
        parcel.writeInterfaceToken("org.chromium.net.IRemoteAndroidKeyStore");
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        s = parcel1.readString();
        parcel1.recycle();
        parcel.recycle();
        return s;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void a(IRemoteAndroidKeyStoreCallbacks iremoteandroidkeystorecallbacks)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("org.chromium.net.IRemoteAndroidKeyStore");
        if (iremoteandroidkeystorecallbacks == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        iremoteandroidkeystorecallbacks = iremoteandroidkeystorecallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(iremoteandroidkeystorecallbacks);
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        iremoteandroidkeystorecallbacks = null;
          goto _L1
        iremoteandroidkeystorecallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw iremoteandroidkeystorecallbacks;
    }

    public byte[] a(int i)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        byte abyte0[];
        parcel.writeInterfaceToken("org.chromium.net.IRemoteAndroidKeyStore");
        parcel.writeInt(i);
        a.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        abyte0 = parcel1.createByteArray();
        parcel1.recycle();
        parcel.recycle();
        return abyte0;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public byte[] a(int i, byte abyte0[])
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("org.chromium.net.IRemoteAndroidKeyStore");
        parcel.writeInt(i);
        parcel.writeByteArray(abyte0);
        a.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        abyte0 = parcel1.createByteArray();
        parcel1.recycle();
        parcel.recycle();
        return abyte0;
        abyte0;
        parcel1.recycle();
        parcel.recycle();
        throw abyte0;
    }

    public byte[] a(String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("org.chromium.net.IRemoteAndroidKeyStore");
        parcel.writeString(s);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        s = parcel1.createByteArray();
        parcel1.recycle();
        parcel.recycle();
        return s;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public IBinder asBinder()
    {
        return a;
    }

    public int b(String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("org.chromium.net.IRemoteAndroidKeyStore");
        parcel.writeString(s);
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public byte[] b(int i)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        byte abyte0[];
        parcel.writeInterfaceToken("org.chromium.net.IRemoteAndroidKeyStore");
        parcel.writeInt(i);
        a.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        abyte0 = parcel1.createByteArray();
        parcel1.recycle();
        parcel.recycle();
        return abyte0;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public byte[] c(int i)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        byte abyte0[];
        parcel.writeInterfaceToken("org.chromium.net.IRemoteAndroidKeyStore");
        parcel.writeInt(i);
        a.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        abyte0 = parcel1.createByteArray();
        parcel1.recycle();
        parcel.recycle();
        return abyte0;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public byte[] d(int i)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        byte abyte0[];
        parcel.writeInterfaceToken("org.chromium.net.IRemoteAndroidKeyStore");
        parcel.writeInt(i);
        a.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        abyte0 = parcel1.createByteArray();
        parcel1.recycle();
        parcel.recycle();
        return abyte0;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public int e(int i)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("org.chromium.net.IRemoteAndroidKeyStore");
        parcel.writeInt(i);
        a.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void f(int i)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("org.chromium.net.IRemoteAndroidKeyStore");
        parcel.writeInt(i);
        a.transact(11, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }
}

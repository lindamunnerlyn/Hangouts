// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.ValidateAccountRequest;

final class eoa
    implements eny
{

    private IBinder a;

    eoa(IBinder ibinder)
    {
        a = ibinder;
    }

    public void a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        a.transact(28, parcel, parcel1, 0);
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

    public void a(env env1, int i1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        env1 = env1.asBinder();
_L1:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        env1 = null;
          goto _L1
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
    }

    public void a(env env1, int i1, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        env1 = env1.asBinder();
_L1:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        env1 = null;
          goto _L1
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
    }

    public void a(env env1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null) goto _L2; else goto _L1
_L1:
        env1 = env1.asBinder();
_L5:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        env1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
          goto _L5
    }

    public void a(env env1, int i1, String s1, IBinder ibinder, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null) goto _L2; else goto _L1
_L1:
        env1 = env1.asBinder();
_L5:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        parcel.writeStrongBinder(ibinder);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(19, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        env1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
          goto _L5
    }

    public void a(env env1, int i1, String s1, String s2)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        env1 = env1.asBinder();
_L1:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        parcel.writeString(s2);
        a.transact(34, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        env1 = null;
          goto _L1
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
    }

    public void a(env env1, int i1, String s1, String s2, String s3, String as[])
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        env1 = env1.asBinder();
_L1:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeString(s3);
        parcel.writeStringArray(as);
        a.transact(33, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        env1 = null;
          goto _L1
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
    }

    public void a(env env1, int i1, String s1, String s2, String as[])
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        env1 = env1.asBinder();
_L1:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeStringArray(as);
        a.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        env1 = null;
          goto _L1
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
    }

    public void a(env env1, int i1, String s1, String s2, String as[], Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null) goto _L2; else goto _L1
_L1:
        env1 = env1.asBinder();
_L5:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeStringArray(as);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(30, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        env1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
          goto _L5
    }

    public void a(env env1, int i1, String s1, String s2, String as[], String s3, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null) goto _L2; else goto _L1
_L1:
        env1 = env1.asBinder();
_L5:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeStringArray(as);
        parcel.writeString(s3);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        env1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
          goto _L5
    }

    public void a(env env1, int i1, String s1, String s2, String as[], String s3, IBinder ibinder, 
            String s4, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null) goto _L2; else goto _L1
_L1:
        env1 = env1.asBinder();
_L5:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeStringArray(as);
        parcel.writeString(s3);
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s4);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        env1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
          goto _L5
    }

    public void a(env env1, int i1, String s1, String as[], String s2, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null) goto _L2; else goto _L1
_L1:
        env1 = env1.asBinder();
_L5:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        parcel.writeStringArray(as);
        parcel.writeString(s2);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(20, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        env1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
          goto _L5
    }

    public void a(env env1, GetServiceRequest getservicerequest)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null) goto _L2; else goto _L1
_L1:
        env1 = env1.asBinder();
_L5:
        parcel.writeStrongBinder(env1);
        if (getservicerequest == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        getservicerequest.writeToParcel(parcel, 0);
_L6:
        a.transact(46, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        env1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
          goto _L5
    }

    public void a(env env1, ValidateAccountRequest validateaccountrequest)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null) goto _L2; else goto _L1
_L1:
        env1 = env1.asBinder();
_L5:
        parcel.writeStrongBinder(env1);
        if (validateaccountrequest == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        validateaccountrequest.writeToParcel(parcel, 0);
_L6:
        a.transact(47, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        env1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
          goto _L5
    }

    public IBinder asBinder()
    {
        return a;
    }

    public void b(env env1, int i1, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        env1 = env1.asBinder();
_L1:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        a.transact(21, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        env1 = null;
          goto _L1
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
    }

    public void b(env env1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null) goto _L2; else goto _L1
_L1:
        env1 = env1.asBinder();
_L5:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        env1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
          goto _L5
    }

    public void c(env env1, int i1, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        env1 = env1.asBinder();
_L1:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        a.transact(22, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        env1 = null;
          goto _L1
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
    }

    public void c(env env1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null) goto _L2; else goto _L1
_L1:
        env1 = env1.asBinder();
_L5:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        env1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
          goto _L5
    }

    public void d(env env1, int i1, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        env1 = env1.asBinder();
_L1:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        a.transact(24, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        env1 = null;
          goto _L1
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
    }

    public void d(env env1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null) goto _L2; else goto _L1
_L1:
        env1 = env1.asBinder();
_L5:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        env1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
          goto _L5
    }

    public void e(env env1, int i1, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        env1 = env1.asBinder();
_L1:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        a.transact(26, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        env1 = null;
          goto _L1
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
    }

    public void e(env env1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null) goto _L2; else goto _L1
_L1:
        env1 = env1.asBinder();
_L5:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        env1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
          goto _L5
    }

    public void f(env env1, int i1, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        env1 = env1.asBinder();
_L1:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        a.transact(31, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        env1 = null;
          goto _L1
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
    }

    public void f(env env1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null) goto _L2; else goto _L1
_L1:
        env1 = env1.asBinder();
_L5:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(11, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        env1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
          goto _L5
    }

    public void g(env env1, int i1, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        env1 = env1.asBinder();
_L1:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        a.transact(32, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        env1 = null;
          goto _L1
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
    }

    public void g(env env1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null) goto _L2; else goto _L1
_L1:
        env1 = env1.asBinder();
_L5:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(12, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        env1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
          goto _L5
    }

    public void h(env env1, int i1, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        env1 = env1.asBinder();
_L1:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        a.transact(35, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        env1 = null;
          goto _L1
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
    }

    public void h(env env1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null) goto _L2; else goto _L1
_L1:
        env1 = env1.asBinder();
_L5:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(13, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        env1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
          goto _L5
    }

    public void i(env env1, int i1, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        env1 = env1.asBinder();
_L1:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        a.transact(36, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        env1 = null;
          goto _L1
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
    }

    public void i(env env1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null) goto _L2; else goto _L1
_L1:
        env1 = env1.asBinder();
_L5:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(14, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        env1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
          goto _L5
    }

    public void j(env env1, int i1, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        env1 = env1.asBinder();
_L1:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        a.transact(40, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        env1 = null;
          goto _L1
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
    }

    public void j(env env1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null) goto _L2; else goto _L1
_L1:
        env1 = env1.asBinder();
_L5:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(15, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        env1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
          goto _L5
    }

    public void k(env env1, int i1, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        env1 = env1.asBinder();
_L1:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        a.transact(42, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        env1 = null;
          goto _L1
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
    }

    public void k(env env1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null) goto _L2; else goto _L1
_L1:
        env1 = env1.asBinder();
_L5:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(16, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        env1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
          goto _L5
    }

    public void l(env env1, int i1, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        env1 = env1.asBinder();
_L1:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        a.transact(44, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        env1 = null;
          goto _L1
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
    }

    public void l(env env1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null) goto _L2; else goto _L1
_L1:
        env1 = env1.asBinder();
_L5:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(17, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        env1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
          goto _L5
    }

    public void m(env env1, int i1, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        env1 = env1.asBinder();
_L1:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        a.transact(45, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        env1 = null;
          goto _L1
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
    }

    public void m(env env1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null) goto _L2; else goto _L1
_L1:
        env1 = env1.asBinder();
_L5:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(18, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        env1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
          goto _L5
    }

    public void n(env env1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null) goto _L2; else goto _L1
_L1:
        env1 = env1.asBinder();
_L5:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(23, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        env1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
          goto _L5
    }

    public void o(env env1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null) goto _L2; else goto _L1
_L1:
        env1 = env1.asBinder();
_L5:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(25, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        env1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
          goto _L5
    }

    public void p(env env1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null) goto _L2; else goto _L1
_L1:
        env1 = env1.asBinder();
_L5:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(27, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        env1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
          goto _L5
    }

    public void q(env env1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null) goto _L2; else goto _L1
_L1:
        env1 = env1.asBinder();
_L5:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(37, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        env1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
          goto _L5
    }

    public void r(env env1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null) goto _L2; else goto _L1
_L1:
        env1 = env1.asBinder();
_L5:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(38, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        env1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
          goto _L5
    }

    public void s(env env1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null) goto _L2; else goto _L1
_L1:
        env1 = env1.asBinder();
_L5:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(41, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        env1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
          goto _L5
    }

    public void t(env env1, int i1, String s1, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (env1 == null) goto _L2; else goto _L1
_L1:
        env1 = env1.asBinder();
_L5:
        parcel.writeStrongBinder(env1);
        parcel.writeInt(i1);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(43, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        env1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        env1;
        parcel1.recycle();
        parcel.recycle();
        throw env1;
          goto _L5
    }
}

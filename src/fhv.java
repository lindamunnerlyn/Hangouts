// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class fhv
    implements fht
{

    private IBinder a;

    public fhv(IBinder ibinder)
    {
        a = ibinder;
    }

    public void a(feu feu1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.mdm.internal.INetworkQualityService");
        if (feu1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        feu1 = feu1.asBinder();
_L1:
        parcel.writeStrongBinder(feu1);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        feu1 = null;
          goto _L1
        feu1;
        parcel1.recycle();
        parcel.recycle();
        throw feu1;
    }

    public void a(fex fex1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.mdm.internal.INetworkQualityService");
        if (fex1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        fex1 = fex1.asBinder();
_L1:
        parcel.writeStrongBinder(fex1);
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fex1 = null;
          goto _L1
        fex1;
        parcel1.recycle();
        parcel.recycle();
        throw fex1;
    }

    public void a(String s, Bundle bundle, Bundle bundle1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.mdm.internal.INetworkQualityService");
        parcel.writeString(s);
        if (bundle == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L3:
        if (bundle1 == null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        parcel.writeInt(1);
        bundle1.writeToParcel(parcel, 0);
_L4:
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
        parcel.writeInt(0);
          goto _L4
    }

    public IBinder asBinder()
    {
        return a;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;

final class fkm
    implements fkk
{

    private IBinder a;

    fkm(IBinder ibinder)
    {
        a = ibinder;
    }

    public fcw a(fnn fnn1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
        if (fnn1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        fnn1 = fnn1.asBinder();
_L1:
        parcel.writeStrongBinder(fnn1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        fnn1 = fcx.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return fnn1;
        fnn1 = null;
          goto _L1
        fnn1;
        parcel1.recycle();
        parcel.recycle();
        throw fnn1;
    }

    public IBinder asBinder()
    {
        return a;
    }

    public fcw b(fnn fnn1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
        if (fnn1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        fnn1 = fnn1.asBinder();
_L1:
        parcel.writeStrongBinder(fnn1);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        fnn1 = fcx.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return fnn1;
        fnn1 = null;
          goto _L1
        fnn1;
        parcel1.recycle();
        parcel.recycle();
        throw fnn1;
    }
}

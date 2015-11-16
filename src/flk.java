// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;

final class flk
    implements fli
{

    private IBinder a;

    flk(IBinder ibinder)
    {
        a = ibinder;
    }

    public void a(fjd fjd1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMapReadyCallback");
        if (fjd1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        fjd1 = fjd1.asBinder();
_L1:
        parcel.writeStrongBinder(fjd1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fjd1 = null;
          goto _L1
        fjd1;
        parcel1.recycle();
        parcel.recycle();
        throw fjd1;
    }

    public IBinder asBinder()
    {
        return a;
    }
}

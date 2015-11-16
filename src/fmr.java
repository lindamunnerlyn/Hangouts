// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;

final class fmr
    implements fmp
{

    private IBinder a;

    fmr(IBinder ibinder)
    {
        a = ibinder;
    }

    public void a(Bitmap bitmap)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        bitmap.writeToParcel(parcel, 0);
_L1:
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        bitmap;
        parcel1.recycle();
        parcel.recycle();
        throw bitmap;
    }

    public void a(fcw fcw1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
        if (fcw1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        fcw1 = fcw1.asBinder();
_L1:
        parcel.writeStrongBinder(fcw1);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fcw1 = null;
          goto _L1
        fcw1;
        parcel1.recycle();
        parcel.recycle();
        throw fcw1;
    }

    public IBinder asBinder()
    {
        return a;
    }
}

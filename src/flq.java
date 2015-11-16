// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;

final class flq
    implements flo
{

    private IBinder a;

    flq(IBinder ibinder)
    {
        a = ibinder;
    }

    public void a(fnn fnn1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
        if (fnn1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        fnn1 = fnn1.asBinder();
_L1:
        parcel.writeStrongBinder(fnn1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
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

    public void b(fnn fnn1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
        if (fnn1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        fnn1 = fnn1.asBinder();
_L1:
        parcel.writeStrongBinder(fnn1);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fnn1 = null;
          goto _L1
        fnn1;
        parcel1.recycle();
        parcel.recycle();
        throw fnn1;
    }

    public void c(fnn fnn1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
        if (fnn1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        fnn1 = fnn1.asBinder();
_L1:
        parcel.writeStrongBinder(fnn1);
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fnn1 = null;
          goto _L1
        fnn1;
        parcel1.recycle();
        parcel.recycle();
        throw fnn1;
    }
}

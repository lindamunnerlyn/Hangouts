// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

final class fgv
    implements fgt
{

    private IBinder a;

    fgv(IBinder ibinder)
    {
        a = ibinder;
    }

    public LatLng a(ezy ezy1)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
        if (ezy1 == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        ezy1 = ezy1.asBinder();
_L1:
        parcel.writeStrongBinder(ezy1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        ezy1 = obj;
        if (parcel1.readInt() != 0)
        {
            ezy1 = LatLng.CREATOR;
            ezy1 = flh.a(parcel1);
        }
        parcel1.recycle();
        parcel.recycle();
        return ezy1;
        ezy1 = null;
          goto _L1
        ezy1;
        parcel1.recycle();
        parcel.recycle();
        throw ezy1;
    }

    public VisibleRegion a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = VisibleRegion.CREATOR;
        obj = fls.a(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return ((VisibleRegion) (obj));
_L2:
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public ezy a(LatLng latlng)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
        if (latlng == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        parcel.writeInt(1);
        latlng.writeToParcel(parcel, 0);
_L1:
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        latlng = ezz.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return latlng;
        parcel.writeInt(0);
          goto _L1
        latlng;
        parcel1.recycle();
        parcel.recycle();
        throw latlng;
    }

    public IBinder asBinder()
    {
        return a;
    }
}

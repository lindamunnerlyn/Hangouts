// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;

final class fjs
    implements fjq
{

    private IBinder a;

    fjs(IBinder ibinder)
    {
        a = ibinder;
    }

    public void a(fgw fgw1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
        if (fgw1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        fgw1 = fgw1.asBinder();
_L1:
        parcel.writeStrongBinder(fgw1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fgw1 = null;
          goto _L1
        fgw1;
        parcel1.recycle();
        parcel.recycle();
        throw fgw1;
    }

    public IBinder asBinder()
    {
        return a;
    }
}

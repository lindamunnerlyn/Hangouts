// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;

final class fio
    implements fim
{

    private IBinder a;

    fio(IBinder ibinder)
    {
        a = ibinder;
    }

    public void a(fgh fgh1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMapReadyCallback");
        if (fgh1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        fgh1 = fgh1.asBinder();
_L1:
        parcel.writeStrongBinder(fgh1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fgh1 = null;
          goto _L1
        fgh1;
        parcel1.recycle();
        parcel.recycle();
        throw fgh1;
    }

    public IBinder asBinder()
    {
        return a;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;

final class fir
    implements fip
{

    private IBinder a;

    fir(IBinder ibinder)
    {
        a = ibinder;
    }

    public boolean a(fkr fkr1)
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerClickListener");
        if (fkr1 == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        fkr1 = fkr1.asBinder();
_L1:
        int i;
        parcel.writeStrongBinder(fkr1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        if (i == 0)
        {
            flag = false;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        fkr1 = null;
          goto _L1
        fkr1;
        parcel1.recycle();
        parcel.recycle();
        throw fkr1;
    }

    public IBinder asBinder()
    {
        return a;
    }
}

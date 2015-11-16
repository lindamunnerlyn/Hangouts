// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;

final class fln
    implements fll
{

    private IBinder a;

    fln(IBinder ibinder)
    {
        a = ibinder;
    }

    public boolean a(fnn fnn1)
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerClickListener");
        if (fnn1 == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        fnn1 = fnn1.asBinder();
_L1:
        int i;
        parcel.writeStrongBinder(fnn1);
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
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

final class fco
    implements fcm
{

    private IBinder a;

    fco(IBinder ibinder)
    {
        a = ibinder;
    }

    public Bundle a(String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.http.IGoogleHttpService");
        parcel.writeString(s);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        s = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return s;
_L2:
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public void a(String s, int i)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.http.IGoogleHttpService");
        parcel.writeString(s);
        parcel.writeInt(i);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public IBinder asBinder()
    {
        return a;
    }
}

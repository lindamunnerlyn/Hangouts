// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public class fcx extends Binder
    implements fcw
{

    public fcx()
    {
        attachInterface(this, "com.google.android.gms.dynamic.IObjectWrapper");
    }

    public static fcw a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if (iinterface != null && (iinterface instanceof fcw))
        {
            return (fcw)iinterface;
        } else
        {
            return new fcy(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.dynamic.IObjectWrapper");
            break;
        }
        return true;
    }
}

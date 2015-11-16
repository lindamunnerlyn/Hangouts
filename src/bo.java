// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;
import android.os.Binder;
import android.os.Parcel;

public abstract class bo extends Binder
    implements bn
{

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("android.support.v4.app.INotificationSideChannel");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
            parcel1 = parcel.readString();
            i = parcel.readInt();
            String s = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Notification)Notification.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(parcel1, i, s, parcel);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
            a(parcel.readString(), parcel.readInt(), parcel.readString());
            return true;

        case 3: // '\003'
            parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
            a(parcel.readString());
            return true;
        }
    }
}

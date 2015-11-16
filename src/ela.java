// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.os.Binder;
import android.os.Parcel;

public abstract class ela extends Binder
    implements ekz
{

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.dialer.incallui.IInCallUiControllerService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.dialer.incallui.IInCallUiControllerService");
            i = a();
            parcel1.writeNoException();
            parcel1.writeInt(i);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.dialer.incallui.IInCallUiControllerService");
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel);
        } else
        {
            parcel = null;
        }
        a(parcel);
        return true;
    }
}

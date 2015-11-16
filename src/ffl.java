// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;

public abstract class ffl extends Binder
    implements ffk
{

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.http.IGoogleHttpService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.http.IGoogleHttpService");
            parcel = a(parcel.readString());
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.http.IGoogleHttpService");
            a(parcel.readString(), parcel.readInt());
            parcel1.writeNoException();
            return true;
        }
    }
}

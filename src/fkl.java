// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.Parcel;

public abstract class fkl extends Binder
    implements fkk
{

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        fcw fcw2 = null;
        fcw fcw1 = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            fcw2 = a(fno.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            parcel = fcw1;
            if (fcw2 != null)
            {
                parcel = fcw2.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            fcw1 = b(fno.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            parcel = fcw2;
            break;
        }
        if (fcw1 != null)
        {
            parcel = fcw1.asBinder();
        }
        parcel1.writeStrongBinder(parcel);
        return true;
    }
}

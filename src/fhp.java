// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.Parcel;

public abstract class fhp extends Binder
    implements fho
{

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        ezy ezy2 = null;
        ezy ezy1 = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            ezy2 = a(fks.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            parcel = ezy1;
            if (ezy2 != null)
            {
                parcel = ezy2.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            ezy1 = b(fks.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            parcel = ezy2;
            break;
        }
        if (ezy1 != null)
        {
            parcel = ezy1.asBinder();
        }
        parcel1.writeStrongBinder(parcel);
        return true;
    }
}

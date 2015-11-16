// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

public abstract class fki extends Binder
    implements fkh
{

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Object obj = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj1 = null;
        Object obj5 = null;
        Object obj2 = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.ICreator");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
            a(fcx.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
            obj = b(fcx.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            parcel = obj2;
            if (obj != null)
            {
                parcel = ((fjj) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
            obj1 = fcx.a(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                fop fop1 = GoogleMapOptions.CREATOR;
                parcel = fop.a(parcel);
            } else
            {
                parcel = null;
            }
            obj1 = a(((fcw) (obj1)), parcel);
            parcel1.writeNoException();
            parcel = ((Parcel) (obj));
            if (obj1 != null)
            {
                parcel = ((fjm) (obj1)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
            obj = a();
            parcel1.writeNoException();
            parcel = obj3;
            if (obj != null)
            {
                parcel = ((fja) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
            obj = b();
            parcel1.writeNoException();
            parcel = obj4;
            if (obj != null)
            {
                parcel = ((fnb) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
            a(fcx.a(parcel.readStrongBinder()), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
            obj = fcx.a(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                foq foq1 = StreetViewPanoramaOptions.CREATOR;
                parcel = foq.a(parcel);
            } else
            {
                parcel = null;
            }
            obj = a(((fcw) (obj)), parcel);
            parcel1.writeNoException();
            parcel = ((Parcel) (obj1));
            if (obj != null)
            {
                parcel = ((fjy) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
            obj = c(fcx.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            parcel = obj5;
            break;
        }
        if (obj != null)
        {
            parcel = ((fjv) (obj)).asBinder();
        }
        parcel1.writeStrongBinder(parcel);
        return true;
    }
}

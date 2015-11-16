// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class fjh extends Binder
    implements fjg
{

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.ILocationSourceDelegate");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ILocationSourceDelegate");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = null;
            } else
            {
                android.os.IInterface iinterface = parcel.queryLocalInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                if (iinterface != null && (iinterface instanceof fkw))
                {
                    parcel = (fkw)iinterface;
                } else
                {
                    parcel = new fky(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ILocationSourceDelegate");
            a();
            parcel1.writeNoException();
            return true;
        }
    }
}

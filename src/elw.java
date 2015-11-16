// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.clearcut.LogEventParcelable;

public abstract class elw extends Binder
    implements elv
{

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
            parcel1 = parcel.readStrongBinder();
            break;
        }
        if (parcel1 == null)
        {
            parcel1 = null;
        } else
        {
            android.os.IInterface iinterface = parcel1.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
            if (iinterface != null && (iinterface instanceof els))
            {
                parcel1 = (els)iinterface;
            } else
            {
                parcel1 = new elu(parcel1);
            }
        }
        if (parcel.readInt() != 0)
        {
            obj = LogEventParcelable.CREATOR;
            obj = elq.a(parcel);
        }
        a(parcel1, ((LogEventParcelable) (obj)));
        return true;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.playlog.internal.LogEvent;
import com.google.android.gms.playlog.internal.PlayLoggerContext;

public abstract class fre extends Binder
    implements frd
{

    public static frd a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.playlog.internal.IPlayLogService");
        if (iinterface != null && (iinterface instanceof frd))
        {
            return (frd)iinterface;
        } else
        {
            return new frf(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        String s = null;
        Object obj1 = null;
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.playlog.internal.IPlayLogService");
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.playlog.internal.IPlayLogService");
            s = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel1 = PlayLoggerContext.CREATOR;
                parcel1 = frc.a(parcel);
            } else
            {
                parcel1 = null;
            }
            if (parcel.readInt() != 0)
            {
                obj = LogEvent.CREATOR;
                obj = fri.a(parcel);
            }
            a(s, parcel1, ((LogEvent) (obj)));
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.playlog.internal.IPlayLogService");
            obj = parcel.readString();
            parcel1 = s;
            if (parcel.readInt() != 0)
            {
                parcel1 = PlayLoggerContext.CREATOR;
                parcel1 = frc.a(parcel);
            }
            a(((String) (obj)), parcel1, parcel.createTypedArrayList(LogEvent.CREATOR));
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.playlog.internal.IPlayLogService");
            obj = parcel.readString();
            parcel1 = obj1;
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel1 = PlayLoggerContext.CREATOR;
            parcel1 = frc.a(parcel);
        }
        a(((String) (obj)), parcel1, parcel.createByteArray());
        return true;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class eku extends Binder
    implements ekt
{

    public static ekt a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.apps.tycho.IVoiceService");
        if (iinterface != null && (iinterface instanceof ekt))
        {
            return (ekt)iinterface;
        } else
        {
            return new ekv(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.apps.tycho.IVoiceService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.apps.tycho.IVoiceService");
            i = a();
            parcel1.writeNoException();
            parcel1.writeInt(i);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.apps.tycho.IVoiceService");
            boolean flag = b();
            parcel1.writeNoException();
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel1.writeInt(i);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.apps.tycho.IVoiceService");
            c();
            return true;
        }
    }
}

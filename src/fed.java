// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.googlehelp.GoogleHelp;

public abstract class fed extends Binder
    implements fec
{

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            GoogleHelp googlehelp;
            if (parcel.readInt() != 0)
            {
                googlehelp = (GoogleHelp)GoogleHelp.CREATOR.createFromParcel(parcel);
            } else
            {
                googlehelp = null;
            }
            a(googlehelp, fea.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            GoogleHelp googlehelp1;
            Bitmap bitmap1;
            if (parcel.readInt() != 0)
            {
                googlehelp1 = (GoogleHelp)GoogleHelp.CREATOR.createFromParcel(parcel);
            } else
            {
                googlehelp1 = null;
            }
            if (parcel.readInt() != 0)
            {
                bitmap1 = (Bitmap)Bitmap.CREATOR.createFromParcel(parcel);
            } else
            {
                bitmap1 = null;
            }
            a(googlehelp1, bitmap1, fea.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            Bitmap bitmap;
            if (parcel.readInt() != 0)
            {
                bitmap = (Bitmap)Bitmap.CREATOR.createFromParcel(parcel);
            } else
            {
                bitmap = null;
            }
            a(bitmap, fea.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            a(fea.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            b(fea.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            c(fea.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;
        }
    }
}

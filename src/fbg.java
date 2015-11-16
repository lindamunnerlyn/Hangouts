// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.googlehelp.GoogleHelp;

final class fbg
    implements fbe
{

    private IBinder a;

    fbg(IBinder ibinder)
    {
        a = ibinder;
    }

    public void a(Bitmap bitmap, fbb fbb1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
        if (bitmap == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        bitmap.writeToParcel(parcel, 0);
_L3:
        if (fbb1 == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        bitmap = fbb1.asBinder();
_L4:
        parcel.writeStrongBinder(bitmap);
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        bitmap;
        parcel1.recycle();
        parcel.recycle();
        throw bitmap;
        bitmap = null;
          goto _L4
    }

    public void a(GoogleHelp googlehelp, Bitmap bitmap, fbb fbb1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
        if (googlehelp == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        googlehelp.writeToParcel(parcel, 0);
_L5:
        if (bitmap == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bitmap.writeToParcel(parcel, 0);
_L6:
        if (fbb1 == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        googlehelp = fbb1.asBinder();
_L7:
        parcel.writeStrongBinder(googlehelp);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L5
        googlehelp;
        parcel1.recycle();
        parcel.recycle();
        throw googlehelp;
_L4:
        parcel.writeInt(0);
          goto _L6
        googlehelp = null;
          goto _L7
    }

    public void a(GoogleHelp googlehelp, fbb fbb1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
        if (googlehelp == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        googlehelp.writeToParcel(parcel, 0);
_L3:
        if (fbb1 == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        googlehelp = fbb1.asBinder();
_L4:
        parcel.writeStrongBinder(googlehelp);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        googlehelp;
        parcel1.recycle();
        parcel.recycle();
        throw googlehelp;
        googlehelp = null;
          goto _L4
    }

    public void a(fbb fbb1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
        if (fbb1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        fbb1 = fbb1.asBinder();
_L1:
        parcel.writeStrongBinder(fbb1);
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fbb1 = null;
          goto _L1
        fbb1;
        parcel1.recycle();
        parcel.recycle();
        throw fbb1;
    }

    public IBinder asBinder()
    {
        return a;
    }

    public void b(fbb fbb1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
        if (fbb1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        fbb1 = fbb1.asBinder();
_L1:
        parcel.writeStrongBinder(fbb1);
        a.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fbb1 = null;
          goto _L1
        fbb1;
        parcel1.recycle();
        parcel.recycle();
        throw fbb1;
    }

    public void c(fbb fbb1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
        if (fbb1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        fbb1 = fbb1.asBinder();
_L1:
        parcel.writeStrongBinder(fbb1);
        a.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fbb1 = null;
          goto _L1
        fbb1;
        parcel1.recycle();
        parcel.recycle();
        throw fbb1;
    }
}

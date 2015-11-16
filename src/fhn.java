// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

final class fhn
    implements fhl
{

    private IBinder a;

    fhn(IBinder ibinder)
    {
        a = ibinder;
    }

    public fge a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        fge fge;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        fge = fgf.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return fge;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public fgq a(ezy ezy1, GoogleMapOptions googlemapoptions)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        if (ezy1 == null) goto _L2; else goto _L1
_L1:
        ezy1 = ezy1.asBinder();
_L5:
        parcel.writeStrongBinder(ezy1);
        if (googlemapoptions == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        googlemapoptions.writeToParcel(parcel, 0);
_L6:
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        ezy1 = fgr.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return ezy1;
_L2:
        ezy1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ezy1;
        parcel1.recycle();
        parcel.recycle();
        throw ezy1;
          goto _L5
    }

    public fhc a(ezy ezy1, StreetViewPanoramaOptions streetviewpanoramaoptions)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        if (ezy1 == null) goto _L2; else goto _L1
_L1:
        ezy1 = ezy1.asBinder();
_L5:
        parcel.writeStrongBinder(ezy1);
        if (streetviewpanoramaoptions == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        streetviewpanoramaoptions.writeToParcel(parcel, 0);
_L6:
        a.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        ezy1 = fhd.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return ezy1;
_L2:
        ezy1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        ezy1;
        parcel1.recycle();
        parcel.recycle();
        throw ezy1;
          goto _L5
    }

    public void a(ezy ezy1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        if (ezy1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        ezy1 = ezy1.asBinder();
_L1:
        parcel.writeStrongBinder(ezy1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ezy1 = null;
          goto _L1
        ezy1;
        parcel1.recycle();
        parcel.recycle();
        throw ezy1;
    }

    public void a(ezy ezy1, int i)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        if (ezy1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        ezy1 = ezy1.asBinder();
_L1:
        parcel.writeStrongBinder(ezy1);
        parcel.writeInt(i);
        a.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ezy1 = null;
          goto _L1
        ezy1;
        parcel1.recycle();
        parcel.recycle();
        throw ezy1;
    }

    public IBinder asBinder()
    {
        return a;
    }

    public fgn b(ezy ezy1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        if (ezy1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        ezy1 = ezy1.asBinder();
_L1:
        parcel.writeStrongBinder(ezy1);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        ezy1 = fgo.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return ezy1;
        ezy1 = null;
          goto _L1
        ezy1;
        parcel1.recycle();
        parcel.recycle();
        throw ezy1;
    }

    public fkf b()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        fkf fkf;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        a.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        fkf = fkg.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return fkf;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public fgz c(ezy ezy1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        if (ezy1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        ezy1 = ezy1.asBinder();
_L1:
        parcel.writeStrongBinder(ezy1);
        a.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        ezy1 = fha.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return ezy1;
        ezy1 = null;
          goto _L1
        ezy1;
        parcel1.recycle();
        parcel.recycle();
        throw ezy1;
    }
}

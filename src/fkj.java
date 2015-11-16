// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

final class fkj
    implements fkh
{

    private IBinder a;

    fkj(IBinder ibinder)
    {
        a = ibinder;
    }

    public fja a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        Object obj;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        obj = parcel1.readStrongBinder();
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = null;
_L3:
        parcel1.recycle();
        parcel.recycle();
        return ((fja) (obj));
_L2:
        android.os.IInterface iinterface = ((IBinder) (obj)).queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        if (iinterface == null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        if (!(iinterface instanceof fja))
        {
            break MISSING_BLOCK_LABEL_85;
        }
        obj = (fja)iinterface;
          goto _L3
        obj = new fjc(((IBinder) (obj)));
          goto _L3
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public fjm a(fcw fcw1, GoogleMapOptions googlemapoptions)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        if (fcw1 == null) goto _L2; else goto _L1
_L1:
        fcw1 = fcw1.asBinder();
_L7:
        parcel.writeStrongBinder(fcw1);
        if (googlemapoptions == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        googlemapoptions.writeToParcel(parcel, 0);
_L8:
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        fcw1 = parcel1.readStrongBinder();
        if (fcw1 != null) goto _L6; else goto _L5
_L5:
        fcw1 = obj;
_L9:
        parcel1.recycle();
        parcel.recycle();
        return fcw1;
_L2:
        fcw1 = null;
          goto _L7
_L4:
        parcel.writeInt(0);
          goto _L8
        fcw1;
        parcel1.recycle();
        parcel.recycle();
        throw fcw1;
_L6:
        googlemapoptions = fcw1.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
        if (googlemapoptions == null)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        if (!(googlemapoptions instanceof fjm))
        {
            break MISSING_BLOCK_LABEL_153;
        }
        fcw1 = (fjm)googlemapoptions;
          goto _L9
        fcw1 = new fjo(fcw1);
          goto _L9
    }

    public fjy a(fcw fcw1, StreetViewPanoramaOptions streetviewpanoramaoptions)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        if (fcw1 == null) goto _L2; else goto _L1
_L1:
        fcw1 = fcw1.asBinder();
_L7:
        parcel.writeStrongBinder(fcw1);
        if (streetviewpanoramaoptions == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        streetviewpanoramaoptions.writeToParcel(parcel, 0);
_L8:
        a.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        fcw1 = parcel1.readStrongBinder();
        if (fcw1 != null) goto _L6; else goto _L5
_L5:
        fcw1 = obj;
_L9:
        parcel1.recycle();
        parcel.recycle();
        return fcw1;
_L2:
        fcw1 = null;
          goto _L7
_L4:
        parcel.writeInt(0);
          goto _L8
        fcw1;
        parcel1.recycle();
        parcel.recycle();
        throw fcw1;
_L6:
        streetviewpanoramaoptions = fcw1.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
        if (streetviewpanoramaoptions == null)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        if (!(streetviewpanoramaoptions instanceof fjy))
        {
            break MISSING_BLOCK_LABEL_154;
        }
        fcw1 = (fjy)streetviewpanoramaoptions;
          goto _L9
        fcw1 = new fka(fcw1);
          goto _L9
    }

    public void a(fcw fcw1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        if (fcw1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        fcw1 = fcw1.asBinder();
_L1:
        parcel.writeStrongBinder(fcw1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fcw1 = null;
          goto _L1
        fcw1;
        parcel1.recycle();
        parcel.recycle();
        throw fcw1;
    }

    public void a(fcw fcw1, int i)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        if (fcw1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        fcw1 = fcw1.asBinder();
_L1:
        parcel.writeStrongBinder(fcw1);
        parcel.writeInt(i);
        a.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fcw1 = null;
          goto _L1
        fcw1;
        parcel1.recycle();
        parcel.recycle();
        throw fcw1;
    }

    public IBinder asBinder()
    {
        return a;
    }

    public fjj b(fcw fcw1)
    {
        android.os.IInterface iinterface;
        Parcel parcel;
        Parcel parcel1;
        iinterface = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        if (fcw1 == null) goto _L2; else goto _L1
_L1:
        fcw1 = fcw1.asBinder();
_L5:
        parcel.writeStrongBinder(fcw1);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        fcw1 = parcel1.readStrongBinder();
        if (fcw1 != null) goto _L4; else goto _L3
_L3:
        fcw1 = iinterface;
_L6:
        parcel1.recycle();
        parcel.recycle();
        return fcw1;
_L2:
        fcw1 = null;
          goto _L5
_L4:
        iinterface = fcw1.queryLocalInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
        if (iinterface == null)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        if (!(iinterface instanceof fjj))
        {
            break MISSING_BLOCK_LABEL_109;
        }
        fcw1 = (fjj)iinterface;
          goto _L6
        fcw1 = new fjl(fcw1);
          goto _L6
        fcw1;
        parcel1.recycle();
        parcel.recycle();
        throw fcw1;
          goto _L5
    }

    public fnb b()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        Object obj;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        a.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        obj = parcel1.readStrongBinder();
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = null;
_L3:
        parcel1.recycle();
        parcel.recycle();
        return ((fnb) (obj));
_L2:
        android.os.IInterface iinterface = ((IBinder) (obj)).queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        if (iinterface == null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        if (!(iinterface instanceof fnb))
        {
            break MISSING_BLOCK_LABEL_85;
        }
        obj = (fnb)iinterface;
          goto _L3
        obj = new fnd(((IBinder) (obj)));
          goto _L3
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public fjv c(fcw fcw1)
    {
        android.os.IInterface iinterface;
        Parcel parcel;
        Parcel parcel1;
        iinterface = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        if (fcw1 == null) goto _L2; else goto _L1
_L1:
        fcw1 = fcw1.asBinder();
_L5:
        parcel.writeStrongBinder(fcw1);
        a.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        fcw1 = parcel1.readStrongBinder();
        if (fcw1 != null) goto _L4; else goto _L3
_L3:
        fcw1 = iinterface;
_L6:
        parcel1.recycle();
        parcel.recycle();
        return fcw1;
_L2:
        fcw1 = null;
          goto _L5
_L4:
        iinterface = fcw1.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
        if (iinterface == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        if (!(iinterface instanceof fjv))
        {
            break MISSING_BLOCK_LABEL_110;
        }
        fcw1 = (fjv)iinterface;
          goto _L6
        fcw1 = new fjx(fcw1);
          goto _L6
        fcw1;
        parcel1.recycle();
        parcel.recycle();
        throw fcw1;
          goto _L5
    }
}

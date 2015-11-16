// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;

final class fjf
    implements fjd
{

    private IBinder a;

    fjf(IBinder ibinder)
    {
        a = ibinder;
    }

    public CameraPosition a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = CameraPosition.CREATOR;
        obj = fnz.a(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return ((CameraPosition) (obj));
_L2:
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public fmy a(PolylineOptions polylineoptions)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (polylineoptions == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        parcel.writeInt(1);
        polylineoptions.writeToParcel(parcel, 0);
_L1:
        a.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        polylineoptions = fmz.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return polylineoptions;
        parcel.writeInt(0);
          goto _L1
        polylineoptions;
        parcel1.recycle();
        parcel.recycle();
        throw polylineoptions;
    }

    public fne a(CircleOptions circleoptions)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (circleoptions == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        parcel.writeInt(1);
        circleoptions.writeToParcel(parcel, 0);
_L1:
        a.transact(35, parcel, parcel1, 0);
        parcel1.readException();
        circleoptions = fnf.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return circleoptions;
        parcel.writeInt(0);
          goto _L1
        circleoptions;
        parcel1.recycle();
        parcel.recycle();
        throw circleoptions;
    }

    public fnh a(GroundOverlayOptions groundoverlayoptions)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (groundoverlayoptions == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        parcel.writeInt(1);
        groundoverlayoptions.writeToParcel(parcel, 0);
_L1:
        a.transact(12, parcel, parcel1, 0);
        parcel1.readException();
        groundoverlayoptions = fni.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return groundoverlayoptions;
        parcel.writeInt(0);
          goto _L1
        groundoverlayoptions;
        parcel1.recycle();
        parcel.recycle();
        throw groundoverlayoptions;
    }

    public fnn a(MarkerOptions markeroptions)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (markeroptions == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        parcel.writeInt(1);
        markeroptions.writeToParcel(parcel, 0);
_L1:
        a.transact(11, parcel, parcel1, 0);
        parcel1.readException();
        markeroptions = fno.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return markeroptions;
        parcel.writeInt(0);
          goto _L1
        markeroptions;
        parcel1.recycle();
        parcel.recycle();
        throw markeroptions;
    }

    public fnq a(PolygonOptions polygonoptions)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (polygonoptions == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        parcel.writeInt(1);
        polygonoptions.writeToParcel(parcel, 0);
_L1:
        a.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        polygonoptions = fnr.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return polygonoptions;
        parcel.writeInt(0);
          goto _L1
        polygonoptions;
        parcel1.recycle();
        parcel.recycle();
        throw polygonoptions;
    }

    public fnt a(TileOverlayOptions tileoverlayoptions)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (tileoverlayoptions == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        parcel.writeInt(1);
        tileoverlayoptions.writeToParcel(parcel, 0);
_L1:
        a.transact(13, parcel, parcel1, 0);
        parcel1.readException();
        tileoverlayoptions = fnu.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return tileoverlayoptions;
        parcel.writeInt(0);
          goto _L1
        tileoverlayoptions;
        parcel1.recycle();
        parcel.recycle();
        throw tileoverlayoptions;
    }

    public void a(int i1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        parcel.writeInt(i1);
        a.transact(16, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void a(int i1, int j1, int k1, int l1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        parcel.writeInt(i1);
        parcel.writeInt(j1);
        parcel.writeInt(k1);
        parcel.writeInt(l1);
        a.transact(39, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void a(Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L1:
        a.transact(54, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        bundle;
        parcel1.recycle();
        parcel.recycle();
        throw bundle;
    }

    public void a(fcw fcw1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (fcw1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        fcw1 = fcw1.asBinder();
_L1:
        parcel.writeStrongBinder(fcw1);
        a.transact(4, parcel, parcel1, 0);
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

    public void a(fcw fcw1, int i1, fke fke1)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (fcw1 == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        fcw1 = fcw1.asBinder();
_L1:
        parcel.writeStrongBinder(fcw1);
        parcel.writeInt(i1);
        fcw1 = obj;
        if (fke1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        fcw1 = fke1.asBinder();
        parcel.writeStrongBinder(fcw1);
        a.transact(7, parcel, parcel1, 0);
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

    public void a(fcw fcw1, fke fke1)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (fcw1 == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        fcw1 = fcw1.asBinder();
_L1:
        parcel.writeStrongBinder(fcw1);
        fcw1 = obj;
        if (fke1 == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        fcw1 = fke1.asBinder();
        parcel.writeStrongBinder(fcw1);
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

    public void a(fjg fjg1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (fjg1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        fjg1 = fjg1.asBinder();
_L1:
        parcel.writeStrongBinder(fjg1);
        a.transact(24, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fjg1 = null;
          goto _L1
        fjg1;
        parcel1.recycle();
        parcel.recycle();
        throw fjg1;
    }

    public void a(fkk fkk1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (fkk1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        fkk1 = fkk1.asBinder();
_L1:
        parcel.writeStrongBinder(fkk1);
        a.transact(33, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fkk1 = null;
          goto _L1
        fkk1;
        parcel1.recycle();
        parcel.recycle();
        throw fkk1;
    }

    public void a(fkn fkn1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (fkn1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        fkn1 = fkn1.asBinder();
_L1:
        parcel.writeStrongBinder(fkn1);
        a.transact(27, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fkn1 = null;
          goto _L1
        fkn1;
        parcel1.recycle();
        parcel.recycle();
        throw fkn1;
    }

    public void a(fkq fkq1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (fkq1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        fkq1 = fkq1.asBinder();
_L1:
        parcel.writeStrongBinder(fkq1);
        a.transact(45, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fkq1 = null;
          goto _L1
        fkq1;
        parcel1.recycle();
        parcel.recycle();
        throw fkq1;
    }

    public void a(fkt fkt1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (fkt1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        fkt1 = fkt1.asBinder();
_L1:
        parcel.writeStrongBinder(fkt1);
        a.transact(32, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fkt1 = null;
          goto _L1
        fkt1;
        parcel1.recycle();
        parcel.recycle();
        throw fkt1;
    }

    public void a(fkz fkz1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (fkz1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        fkz1 = fkz1.asBinder();
_L1:
        parcel.writeStrongBinder(fkz1);
        a.transact(28, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fkz1 = null;
          goto _L1
        fkz1;
        parcel1.recycle();
        parcel.recycle();
        throw fkz1;
    }

    public void a(flc flc1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (flc1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        flc1 = flc1.asBinder();
_L1:
        parcel.writeStrongBinder(flc1);
        a.transact(42, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        flc1 = null;
          goto _L1
        flc1;
        parcel1.recycle();
        parcel.recycle();
        throw flc1;
    }

    public void a(flf flf1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (flf1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        flf1 = flf1.asBinder();
_L1:
        parcel.writeStrongBinder(flf1);
        a.transact(29, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        flf1 = null;
          goto _L1
        flf1;
        parcel1.recycle();
        parcel.recycle();
        throw flf1;
    }

    public void a(fli fli1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (fli1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        fli1 = fli1.asBinder();
_L1:
        parcel.writeStrongBinder(fli1);
        a.transact(53, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fli1 = null;
          goto _L1
        fli1;
        parcel1.recycle();
        parcel.recycle();
        throw fli1;
    }

    public void a(fll fll1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (fll1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        fll1 = fll1.asBinder();
_L1:
        parcel.writeStrongBinder(fll1);
        a.transact(30, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fll1 = null;
          goto _L1
        fll1;
        parcel1.recycle();
        parcel.recycle();
        throw fll1;
    }

    public void a(flo flo1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (flo1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        flo1 = flo1.asBinder();
_L1:
        parcel.writeStrongBinder(flo1);
        a.transact(31, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        flo1 = null;
          goto _L1
        flo1;
        parcel1.recycle();
        parcel.recycle();
        throw flo1;
    }

    public void a(flr flr1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (flr1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        flr1 = flr1.asBinder();
_L1:
        parcel.writeStrongBinder(flr1);
        a.transact(37, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        flr1 = null;
          goto _L1
        flr1;
        parcel1.recycle();
        parcel.recycle();
        throw flr1;
    }

    public void a(flu flu1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (flu1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        flu1 = flu1.asBinder();
_L1:
        parcel.writeStrongBinder(flu1);
        a.transact(36, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        flu1 = null;
          goto _L1
        flu1;
        parcel1.recycle();
        parcel.recycle();
        throw flu1;
    }

    public void a(flx flx1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (flx1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        flx1 = flx1.asBinder();
_L1:
        parcel.writeStrongBinder(flx1);
        a.transact(80, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        flx1 = null;
          goto _L1
        flx1;
        parcel1.recycle();
        parcel.recycle();
        throw flx1;
    }

    public void a(fmp fmp1, fcw fcw1)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (fmp1 == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        fmp1 = fmp1.asBinder();
_L1:
        parcel.writeStrongBinder(fmp1);
        fmp1 = obj;
        if (fcw1 == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        fmp1 = fcw1.asBinder();
        parcel.writeStrongBinder(fmp1);
        a.transact(38, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fmp1 = null;
          goto _L1
        fmp1;
        parcel1.recycle();
        parcel.recycle();
        throw fmp1;
    }

    public void a(String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        parcel.writeString(s1);
        a.transact(61, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public void a(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        a.transact(18, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public IBinder asBinder()
    {
        return a;
    }

    public float b()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        float f1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        f1 = parcel1.readFloat();
        parcel1.recycle();
        parcel.recycle();
        return f1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void b(Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L1:
        a.transact(60, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() != 0)
        {
            bundle.readFromParcel(parcel1);
        }
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        bundle;
        parcel1.recycle();
        parcel.recycle();
        throw bundle;
    }

    public void b(fcw fcw1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (fcw1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        fcw1 = fcw1.asBinder();
_L1:
        parcel.writeStrongBinder(fcw1);
        a.transact(5, parcel, parcel1, 0);
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

    public boolean b(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag1;
        flag1 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        int i1;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        a.transact(20, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        if (i1 != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public float c()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        float f1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        f1 = parcel1.readFloat();
        parcel1.recycle();
        parcel.recycle();
        return f1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void c(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        a.transact(22, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void d()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void d(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        a.transact(41, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void e()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(14, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public int f()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(15, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public boolean g()
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(17, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        if (i1 != 0)
        {
            flag = true;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public boolean h()
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(19, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        if (i1 != 0)
        {
            flag = true;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public boolean i()
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(21, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        if (i1 != 0)
        {
            flag = true;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public Location j()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(23, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        Location location = (Location)Location.CREATOR.createFromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return location;
_L2:
        location = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public fkb k()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        Object obj;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(25, parcel, parcel1, 0);
        parcel1.readException();
        obj = parcel1.readStrongBinder();
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = null;
_L3:
        parcel1.recycle();
        parcel.recycle();
        return ((fkb) (obj));
_L2:
        android.os.IInterface iinterface = ((IBinder) (obj)).queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
        if (iinterface == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        if (!(iinterface instanceof fkb))
        {
            break MISSING_BLOCK_LABEL_86;
        }
        obj = (fkb)iinterface;
          goto _L3
        obj = new fkd(((IBinder) (obj)));
          goto _L3
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public fjp l()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        Object obj;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(26, parcel, parcel1, 0);
        parcel1.readException();
        obj = parcel1.readStrongBinder();
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = null;
_L3:
        parcel1.recycle();
        parcel.recycle();
        return ((fjp) (obj));
_L2:
        android.os.IInterface iinterface = ((IBinder) (obj)).queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
        if (iinterface == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        if (!(iinterface instanceof fjp))
        {
            break MISSING_BLOCK_LABEL_86;
        }
        obj = (fjp)iinterface;
          goto _L3
        obj = new fjr(((IBinder) (obj)));
          goto _L3
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public boolean m()
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(40, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        if (i1 != 0)
        {
            flag = true;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public fnk n()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        fnk fnk;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(44, parcel, parcel1, 0);
        parcel1.readException();
        fnk = fnl.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return fnk;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void o()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(55, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void p()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(56, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void q()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(57, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void r()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(58, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public boolean s()
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(59, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        if (i1 != 0)
        {
            flag = true;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }
}

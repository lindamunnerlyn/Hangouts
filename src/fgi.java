// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.location.Location;
import android.os.Binder;
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

public abstract class fgi extends Binder
    implements fgh
{

    public static fgh a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (iinterface != null && (iinterface instanceof fgh))
        {
            return (fgh)iinterface;
        } else
        {
            return new fgj(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        boolean flag = false;
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag13 = false;
        boolean flag3 = false;
        boolean flag14 = false;
        boolean flag4 = false;
        boolean flag5 = false;
        Object obj6 = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        Object obj14 = null;
        Object obj15 = null;
        Object obj16 = null;
        Object obj5 = null;
        Object obj17 = null;
        Object obj18 = null;
        Object obj19 = null;
        Object obj20 = null;
        Object obj21 = null;
        Object obj22 = null;
        Object obj23 = null;
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = a();
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            float f = b();
            parcel1.writeNoException();
            parcel1.writeFloat(f);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            float f1 = c();
            parcel1.writeNoException();
            parcel1.writeFloat(f1);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(ezz.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            b(ezz.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(ezz.a(parcel.readStrongBinder()), fhj.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(ezz.a(parcel.readStrongBinder()), parcel.readInt(), fhj.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            d();
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (parcel.readInt() != 0)
            {
                obj2 = PolylineOptions.CREATOR;
                parcel = fll.a(parcel);
            } else
            {
                parcel = null;
            }
            obj2 = a(parcel);
            parcel1.writeNoException();
            parcel = obj;
            if (obj2 != null)
            {
                parcel = ((fkc) (obj2)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            fku fku1;
            if (parcel.readInt() != 0)
            {
                parcel = PolygonOptions.CREATOR.a(parcel);
            } else
            {
                parcel = null;
            }
            fku1 = a(parcel);
            parcel1.writeNoException();
            parcel = obj6;
            if (fku1 != null)
            {
                parcel = fku1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            fkr fkr1;
            if (parcel.readInt() != 0)
            {
                fli fli1 = MarkerOptions.CREATOR;
                parcel = fli.a(parcel);
            } else
            {
                parcel = null;
            }
            fkr1 = a(parcel);
            parcel1.writeNoException();
            parcel = ((Parcel) (obj2));
            if (fkr1 != null)
            {
                parcel = fkr1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            fkl fkl1;
            if (parcel.readInt() != 0)
            {
                flf flf1 = GroundOverlayOptions.CREATOR;
                parcel = flf.a(parcel);
            } else
            {
                parcel = null;
            }
            fkl1 = a(parcel);
            parcel1.writeNoException();
            parcel = obj3;
            if (fkl1 != null)
            {
                parcel = fkl1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            fkx fkx1;
            if (parcel.readInt() != 0)
            {
                flr flr1 = TileOverlayOptions.CREATOR;
                parcel = flr.a(parcel);
            } else
            {
                parcel = null;
            }
            fkx1 = a(parcel);
            parcel1.writeNoException();
            parcel = obj4;
            if (fkx1 != null)
            {
                parcel = fkx1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            e();
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            i = f();
            parcel1.writeNoException();
            parcel1.writeInt(i);
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            flag5 = g();
            parcel1.writeNoException();
            if (flag5)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel1.writeInt(i);
            return true;

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (parcel.readInt() != 0)
            {
                flag5 = true;
            }
            a(flag5);
            parcel1.writeNoException();
            return true;

        case 19: // '\023'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            boolean flag6 = h();
            parcel1.writeNoException();
            i = ((flag) ? 1 : 0);
            if (flag6)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 20: // '\024'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            boolean flag7;
            if (parcel.readInt() != 0)
            {
                flag7 = true;
            } else
            {
                flag7 = false;
            }
            flag7 = b(flag7);
            parcel1.writeNoException();
            i = ((flag1) ? 1 : 0);
            if (flag7)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 21: // '\025'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            boolean flag8 = i();
            parcel1.writeNoException();
            i = ((flag2) ? 1 : 0);
            if (flag8)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 22: // '\026'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            boolean flag9 = flag13;
            if (parcel.readInt() != 0)
            {
                flag9 = true;
            }
            c(flag9);
            parcel1.writeNoException();
            return true;

        case 23: // '\027'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = j();
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }

        case 24: // '\030'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj7;
            } else
            {
                android.os.IInterface iinterface = parcel.queryLocalInterface("com.google.android.gms.maps.internal.ILocationSourceDelegate");
                if (iinterface != null && (iinterface instanceof fgk))
                {
                    parcel = (fgk)iinterface;
                } else
                {
                    parcel = new fgm(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 25: // '\031'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            fhf fhf1 = k();
            parcel1.writeNoException();
            parcel = obj8;
            if (fhf1 != null)
            {
                parcel = fhf1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 26: // '\032'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            fgt fgt1 = l();
            parcel1.writeNoException();
            parcel = obj9;
            if (fgt1 != null)
            {
                parcel = fgt1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 27: // '\033'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj10;
            } else
            {
                android.os.IInterface iinterface1 = parcel.queryLocalInterface("com.google.android.gms.maps.internal.IOnCameraChangeListener");
                if (iinterface1 != null && (iinterface1 instanceof fhr))
                {
                    parcel = (fhr)iinterface1;
                } else
                {
                    parcel = new fht(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 28: // '\034'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj11;
            } else
            {
                android.os.IInterface iinterface2 = parcel.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapClickListener");
                if (iinterface2 != null && (iinterface2 instanceof fid))
                {
                    parcel = (fid)iinterface2;
                } else
                {
                    parcel = new fif(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 29: // '\035'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj12;
            } else
            {
                android.os.IInterface iinterface3 = parcel.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapLongClickListener");
                if (iinterface3 != null && (iinterface3 instanceof fij))
                {
                    parcel = (fij)iinterface3;
                } else
                {
                    parcel = new fil(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 30: // '\036'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj13;
            } else
            {
                android.os.IInterface iinterface4 = parcel.queryLocalInterface("com.google.android.gms.maps.internal.IOnMarkerClickListener");
                if (iinterface4 != null && (iinterface4 instanceof fip))
                {
                    parcel = (fip)iinterface4;
                } else
                {
                    parcel = new fir(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 31: // '\037'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj14;
            } else
            {
                android.os.IInterface iinterface5 = parcel.queryLocalInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                if (iinterface5 != null && (iinterface5 instanceof fis))
                {
                    parcel = (fis)iinterface5;
                } else
                {
                    parcel = new fiu(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 32: // ' '
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj15;
            } else
            {
                android.os.IInterface iinterface6 = parcel.queryLocalInterface("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
                if (iinterface6 != null && (iinterface6 instanceof fhx))
                {
                    parcel = (fhx)iinterface6;
                } else
                {
                    parcel = new fhz(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 33: // '!'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj16;
            } else
            {
                android.os.IInterface iinterface7 = parcel.queryLocalInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                if (iinterface7 != null && (iinterface7 instanceof fho))
                {
                    parcel = (fho)iinterface7;
                } else
                {
                    parcel = new fhq(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 35: // '#'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            fki fki1;
            if (parcel.readInt() != 0)
            {
                fle fle1 = CircleOptions.CREATOR;
                parcel = fle.a(parcel);
            } else
            {
                parcel = null;
            }
            fki1 = a(parcel);
            parcel1.writeNoException();
            parcel = obj5;
            if (fki1 != null)
            {
                parcel = fki1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 36: // '$'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj17;
            } else
            {
                android.os.IInterface iinterface8 = parcel.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
                if (iinterface8 != null && (iinterface8 instanceof fiy))
                {
                    parcel = (fiy)iinterface8;
                } else
                {
                    parcel = new fja(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 37: // '%'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj18;
            } else
            {
                android.os.IInterface iinterface9 = parcel.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
                if (iinterface9 != null && (iinterface9 instanceof fiv))
                {
                    parcel = (fiv)iinterface9;
                } else
                {
                    parcel = new fix(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 38: // '&'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            Object obj1 = parcel.readStrongBinder();
            if (obj1 == null)
            {
                obj1 = obj19;
            } else
            {
                android.os.IInterface iinterface13 = ((IBinder) (obj1)).queryLocalInterface("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
                if (iinterface13 != null && (iinterface13 instanceof fjt))
                {
                    obj1 = (fjt)iinterface13;
                } else
                {
                    obj1 = new fjv(((IBinder) (obj1)));
                }
            }
            a(((fjt) (obj1)), ezz.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 39: // '\''
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 40: // '('
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            boolean flag10 = m();
            parcel1.writeNoException();
            i = ((flag3) ? 1 : 0);
            if (flag10)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 41: // ')'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            boolean flag11 = flag14;
            if (parcel.readInt() != 0)
            {
                flag11 = true;
            }
            d(flag11);
            parcel1.writeNoException();
            return true;

        case 42: // '*'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj20;
            } else
            {
                android.os.IInterface iinterface10 = parcel.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
                if (iinterface10 != null && (iinterface10 instanceof fig))
                {
                    parcel = (fig)iinterface10;
                } else
                {
                    parcel = new fii(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 44: // ','
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            fko fko1 = n();
            parcel1.writeNoException();
            parcel = obj21;
            if (fko1 != null)
            {
                parcel = fko1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 45: // '-'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj22;
            } else
            {
                android.os.IInterface iinterface11 = parcel.queryLocalInterface("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
                if (iinterface11 != null && (iinterface11 instanceof fhu))
                {
                    parcel = (fhu)iinterface11;
                } else
                {
                    parcel = new fhw(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 53: // '5'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(fin.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 54: // '6'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 55: // '7'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            o();
            parcel1.writeNoException();
            return true;

        case 56: // '8'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            p();
            parcel1.writeNoException();
            return true;

        case 57: // '9'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            q();
            parcel1.writeNoException();
            return true;

        case 58: // ':'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            r();
            parcel1.writeNoException();
            return true;

        case 59: // ';'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            boolean flag12 = s();
            parcel1.writeNoException();
            i = ((flag4) ? 1 : 0);
            if (flag12)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 60: // '<'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            b(parcel);
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }

        case 61: // '='
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(parcel.readString());
            parcel1.writeNoException();
            return true;

        case 80: // 'P'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            parcel = parcel.readStrongBinder();
            break;
        }
        if (parcel == null)
        {
            parcel = obj23;
        } else
        {
            android.os.IInterface iinterface12 = parcel.queryLocalInterface("com.google.android.gms.maps.internal.IOnPoiClickListener");
            if (iinterface12 != null && (iinterface12 instanceof fjb))
            {
                parcel = (fjb)iinterface12;
            } else
            {
                parcel = new fjd(parcel);
            }
        }
        a(parcel);
        parcel1.writeNoException();
        return true;
    }
}

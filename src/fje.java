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

public abstract class fje extends Binder
    implements fjd
{

    public static fjd a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (iinterface != null && (iinterface instanceof fjd))
        {
            return (fjd)iinterface;
        } else
        {
            return new fjf(ibinder);
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
            a(fcx.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            b(fcx.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(fcx.a(parcel.readStrongBinder()), fkf.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(fcx.a(parcel.readStrongBinder()), parcel.readInt(), fkf.a(parcel.readStrongBinder()));
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
                parcel = foh.a(parcel);
            } else
            {
                parcel = null;
            }
            obj2 = a(parcel);
            parcel1.writeNoException();
            parcel = obj;
            if (obj2 != null)
            {
                parcel = ((fmy) (obj2)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            fnq fnq1;
            if (parcel.readInt() != 0)
            {
                parcel = PolygonOptions.CREATOR.a(parcel);
            } else
            {
                parcel = null;
            }
            fnq1 = a(parcel);
            parcel1.writeNoException();
            parcel = obj6;
            if (fnq1 != null)
            {
                parcel = fnq1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            fnn fnn1;
            if (parcel.readInt() != 0)
            {
                foe foe1 = MarkerOptions.CREATOR;
                parcel = foe.a(parcel);
            } else
            {
                parcel = null;
            }
            fnn1 = a(parcel);
            parcel1.writeNoException();
            parcel = ((Parcel) (obj2));
            if (fnn1 != null)
            {
                parcel = fnn1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            fnh fnh1;
            if (parcel.readInt() != 0)
            {
                fob fob1 = GroundOverlayOptions.CREATOR;
                parcel = fob.a(parcel);
            } else
            {
                parcel = null;
            }
            fnh1 = a(parcel);
            parcel1.writeNoException();
            parcel = obj3;
            if (fnh1 != null)
            {
                parcel = fnh1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            fnt fnt1;
            if (parcel.readInt() != 0)
            {
                fon fon1 = TileOverlayOptions.CREATOR;
                parcel = fon.a(parcel);
            } else
            {
                parcel = null;
            }
            fnt1 = a(parcel);
            parcel1.writeNoException();
            parcel = obj4;
            if (fnt1 != null)
            {
                parcel = fnt1.asBinder();
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
                if (iinterface != null && (iinterface instanceof fjg))
                {
                    parcel = (fjg)iinterface;
                } else
                {
                    parcel = new fji(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 25: // '\031'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            fkb fkb1 = k();
            parcel1.writeNoException();
            parcel = obj8;
            if (fkb1 != null)
            {
                parcel = fkb1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 26: // '\032'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            fjp fjp1 = l();
            parcel1.writeNoException();
            parcel = obj9;
            if (fjp1 != null)
            {
                parcel = fjp1.asBinder();
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
                if (iinterface1 != null && (iinterface1 instanceof fkn))
                {
                    parcel = (fkn)iinterface1;
                } else
                {
                    parcel = new fkp(parcel);
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
                if (iinterface2 != null && (iinterface2 instanceof fkz))
                {
                    parcel = (fkz)iinterface2;
                } else
                {
                    parcel = new flb(parcel);
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
                if (iinterface3 != null && (iinterface3 instanceof flf))
                {
                    parcel = (flf)iinterface3;
                } else
                {
                    parcel = new flh(parcel);
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
                if (iinterface4 != null && (iinterface4 instanceof fll))
                {
                    parcel = (fll)iinterface4;
                } else
                {
                    parcel = new fln(parcel);
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
                if (iinterface5 != null && (iinterface5 instanceof flo))
                {
                    parcel = (flo)iinterface5;
                } else
                {
                    parcel = new flq(parcel);
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
                if (iinterface6 != null && (iinterface6 instanceof fkt))
                {
                    parcel = (fkt)iinterface6;
                } else
                {
                    parcel = new fkv(parcel);
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
                if (iinterface7 != null && (iinterface7 instanceof fkk))
                {
                    parcel = (fkk)iinterface7;
                } else
                {
                    parcel = new fkm(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 35: // '#'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            fne fne1;
            if (parcel.readInt() != 0)
            {
                foa foa1 = CircleOptions.CREATOR;
                parcel = foa.a(parcel);
            } else
            {
                parcel = null;
            }
            fne1 = a(parcel);
            parcel1.writeNoException();
            parcel = obj5;
            if (fne1 != null)
            {
                parcel = fne1.asBinder();
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
                if (iinterface8 != null && (iinterface8 instanceof flu))
                {
                    parcel = (flu)iinterface8;
                } else
                {
                    parcel = new flw(parcel);
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
                if (iinterface9 != null && (iinterface9 instanceof flr))
                {
                    parcel = (flr)iinterface9;
                } else
                {
                    parcel = new flt(parcel);
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
                if (iinterface13 != null && (iinterface13 instanceof fmp))
                {
                    obj1 = (fmp)iinterface13;
                } else
                {
                    obj1 = new fmr(((IBinder) (obj1)));
                }
            }
            a(((fmp) (obj1)), fcx.a(parcel.readStrongBinder()));
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
                if (iinterface10 != null && (iinterface10 instanceof flc))
                {
                    parcel = (flc)iinterface10;
                } else
                {
                    parcel = new fle(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 44: // ','
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            fnk fnk1 = n();
            parcel1.writeNoException();
            parcel = obj21;
            if (fnk1 != null)
            {
                parcel = fnk1.asBinder();
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
                if (iinterface11 != null && (iinterface11 instanceof fkq))
                {
                    parcel = (fkq)iinterface11;
                } else
                {
                    parcel = new fks(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 53: // '5'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(flj.a(parcel.readStrongBinder()));
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
            if (iinterface12 != null && (iinterface12 instanceof flx))
            {
                parcel = (flx)iinterface12;
            } else
            {
                parcel = new flz(parcel);
            }
        }
        a(parcel);
        parcel1.writeNoException();
        return true;
    }
}

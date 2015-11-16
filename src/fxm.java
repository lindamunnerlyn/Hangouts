// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.internal.AddListenerRequest;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.RemoveListenerRequest;

public abstract class fxm extends Binder
    implements fxl
{

    public static fxl a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        if (iinterface != null && (iinterface instanceof fxl))
        {
            return (fxl)iinterface;
        } else
        {
            return new fxn(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        boolean flag = false;
        fxf fxf15 = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj = null;
        Object obj11 = null;
        Object obj1 = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.wearable.internal.IWearableService");
            return true;

        case 20: // '\024'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            fxf15 = fxg.a(parcel.readStrongBinder());
            obj = obj1;
            if (parcel.readInt() != 0)
            {
                obj = (ConnectionConfiguration)ConnectionConfiguration.CREATOR.createFromParcel(parcel);
            }
            a(fxf15, ((ConnectionConfiguration) (obj)));
            parcel1.writeNoException();
            return true;

        case 21: // '\025'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            a(fxg.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 22: // '\026'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            a(fxg.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 23: // '\027'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            b(fxg.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 24: // '\030'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            c(fxg.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            fxf fxf2 = fxg.a(parcel.readStrongBinder());
            obj = fxf15;
            if (parcel.readInt() != 0)
            {
                obj = (PutDataRequest)PutDataRequest.CREATOR.createFromParcel(parcel);
            }
            a(fxf2, ((PutDataRequest) (obj)));
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            fxf fxf3 = fxg.a(parcel.readStrongBinder());
            obj = obj2;
            if (parcel.readInt() != 0)
            {
                obj = (Uri)Uri.CREATOR.createFromParcel(parcel);
            }
            a(fxf3, ((Uri) (obj)));
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            b(fxg.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            fxf fxf4 = fxg.a(parcel.readStrongBinder());
            obj = obj3;
            if (parcel.readInt() != 0)
            {
                obj = (Uri)Uri.CREATOR.createFromParcel(parcel);
            }
            b(fxf4, ((Uri) (obj)));
            parcel1.writeNoException();
            return true;

        case 40: // '('
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            fxf fxf5 = fxg.a(parcel.readStrongBinder());
            obj = obj4;
            if (parcel.readInt() != 0)
            {
                obj = (Uri)Uri.CREATOR.createFromParcel(parcel);
            }
            a(fxf5, ((Uri) (obj)), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            fxf fxf6 = fxg.a(parcel.readStrongBinder());
            obj = obj5;
            if (parcel.readInt() != 0)
            {
                obj = (Uri)Uri.CREATOR.createFromParcel(parcel);
            }
            c(fxf6, ((Uri) (obj)));
            parcel1.writeNoException();
            return true;

        case 41: // ')'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            fxf fxf7 = fxg.a(parcel.readStrongBinder());
            obj = obj6;
            if (parcel.readInt() != 0)
            {
                obj = (Uri)Uri.CREATOR.createFromParcel(parcel);
            }
            b(fxf7, ((Uri) (obj)), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            a(fxg.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.createByteArray());
            parcel1.writeNoException();
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            fxf fxf8 = fxg.a(parcel.readStrongBinder());
            obj = obj7;
            if (parcel.readInt() != 0)
            {
                obj = (Asset)Asset.CREATOR.createFromParcel(parcel);
            }
            a(fxf8, ((Asset) (obj)));
            parcel1.writeNoException();
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            c(fxg.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            d(fxg.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 42: // '*'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            a(fxg.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 43: // '+'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            a(fxg.a(parcel.readStrongBinder()), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 46: // '.'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            d(fxg.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 47: // '/'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            e(fxg.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            fxf fxf9 = fxg.a(parcel.readStrongBinder());
            obj = obj8;
            if (parcel.readInt() != 0)
            {
                obj = (AddListenerRequest)AddListenerRequest.CREATOR.createFromParcel(parcel);
            }
            a(fxf9, ((AddListenerRequest) (obj)));
            parcel1.writeNoException();
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            fxf fxf10 = fxg.a(parcel.readStrongBinder());
            obj = obj9;
            if (parcel.readInt() != 0)
            {
                obj = (RemoveListenerRequest)RemoveListenerRequest.CREATOR.createFromParcel(parcel);
            }
            a(fxf10, ((RemoveListenerRequest) (obj)));
            parcel1.writeNoException();
            return true;

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            e(fxg.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 19: // '\023'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            f(fxg.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 25: // '\031'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            g(fxg.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 26: // '\032'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            h(fxg.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 27: // '\033'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            fxf fxf11 = fxg.a(parcel.readStrongBinder());
            obj = obj10;
            if (parcel.readInt() != 0)
            {
                obj = (AncsNotificationParcelable)AncsNotificationParcelable.CREATOR.createFromParcel(parcel);
            }
            a(fxf11, ((AncsNotificationParcelable) (obj)));
            parcel1.writeNoException();
            return true;

        case 28: // '\034'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            b(fxg.a(parcel.readStrongBinder()), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 29: // '\035'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            c(fxg.a(parcel.readStrongBinder()), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 30: // '\036'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            i(fxg.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 31: // '\037'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            a(fxg.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 32: // ' '
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            f(fxg.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 33: // '!'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            b(fxg.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 34: // '"'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            a(fxg.a(parcel.readStrongBinder()), fxd.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 35: // '#'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            b(fxg.a(parcel.readStrongBinder()), fxd.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 38: // '&'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            fxf fxf12 = fxg.a(parcel.readStrongBinder());
            String s = parcel.readString();
            if (parcel.readInt() != 0)
            {
                obj = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
            }
            a(fxf12, s, ((ParcelFileDescriptor) (obj)));
            parcel1.writeNoException();
            return true;

        case 39: // '\''
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            fxf fxf13 = fxg.a(parcel.readStrongBinder());
            String s1 = parcel.readString();
            ParcelFileDescriptor parcelfiledescriptor;
            if (parcel.readInt() != 0)
            {
                parcelfiledescriptor = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
            } else
            {
                parcelfiledescriptor = null;
            }
            a(fxf13, s1, parcelfiledescriptor, parcel.readLong(), parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 37: // '%'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            j(fxg.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 48: // '0'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            fxf fxf = fxg.a(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(fxf, flag);
            parcel1.writeNoException();
            return true;

        case 49: // '1'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            k(fxg.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 50: // '2'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            fxf fxf1 = fxg.a(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                flag = true;
            }
            b(fxf1, flag);
            parcel1.writeNoException();
            return true;

        case 51: // '3'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            l(fxg.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 52: // '4'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            m(fxg.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 53: // '5'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            a(fxg.a(parcel.readStrongBinder()), parcel.readByte());
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            fxf fxf14 = fxg.a(parcel.readStrongBinder());
            ConnectionConfiguration connectionconfiguration = obj11;
            if (parcel.readInt() != 0)
            {
                connectionconfiguration = (ConnectionConfiguration)ConnectionConfiguration.CREATOR.createFromParcel(parcel);
            }
            b(fxf14, connectionconfiguration);
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            n(fxg.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            o(fxg.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            p(fxg.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;
        }
    }
}

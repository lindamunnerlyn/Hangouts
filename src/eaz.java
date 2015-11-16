// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class eaz extends Binder
    implements eay
{

    public eaz()
    {
        attachInterface(this, "com.google.android.apps.hangouts.telephony.ui.ITeleWifiCallingSettingsService");
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Account account = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.apps.hangouts.telephony.ui.ITeleWifiCallingSettingsService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.apps.hangouts.telephony.ui.ITeleWifiCallingSettingsService");
            a();
            parcel1.writeNoException();
            parcel1.writeInt(3);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.apps.hangouts.telephony.ui.ITeleWifiCallingSettingsService");
            b();
            parcel1.writeNoException();
            parcel1.writeString(null);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.apps.hangouts.telephony.ui.ITeleWifiCallingSettingsService");
            a(parcel.readString());
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.apps.hangouts.telephony.ui.ITeleWifiCallingSettingsService");
            c();
            parcel1.writeNoException();
            parcel1.writeInt(0);
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.apps.hangouts.telephony.ui.ITeleWifiCallingSettingsService");
            if (parcel.readInt() != 0)
            {
                Account.CREATOR.createFromParcel(parcel);
            }
            d();
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.apps.hangouts.telephony.ui.ITeleWifiCallingSettingsService");
            e();
            parcel1.writeNoException();
            parcel1.writeInt(0);
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.apps.hangouts.telephony.ui.ITeleWifiCallingSettingsService");
            if (parcel.readInt() != 0)
            {
                account = (Account)Account.CREATOR.createFromParcel(parcel);
            }
            a(account);
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.apps.hangouts.telephony.ui.ITeleWifiCallingSettingsService");
            a(parcel.readLong());
            parcel1.writeNoException();
            return true;
        }
    }
}

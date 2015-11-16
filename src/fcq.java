// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.identity.accounts.api.AccountData;

public final class fcq
    implements android.os.Parcelable.Creator
{

    public fcq()
    {
    }

    public static void a(AccountData accountdata, Parcel parcel)
    {
        int i = g.p(parcel, 20293);
        g.a(parcel, 1, accountdata.b());
        g.b(parcel, 1000, accountdata.a());
        g.a(parcel, 2, accountdata.c());
        g.q(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        String s1 = null;
        int j = g.a(parcel);
        int i = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    g.b(parcel, k);
                    break;

                case 1: // '\001'
                    s = g.i(parcel, k);
                    break;

                case 1000: 
                    i = g.e(parcel, k);
                    break;

                case 2: // '\002'
                    s1 = g.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new AccountData(i, s, s1);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new AccountData[i];
    }
}

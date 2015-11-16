// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.ResolveAccountRequest;

public final class eog
    implements android.os.Parcelable.Creator
{

    public eog()
    {
    }

    public static void a(ResolveAccountRequest resolveaccountrequest, Parcel parcel, int i)
    {
        int j = g.p(parcel, 20293);
        g.b(parcel, 1, resolveaccountrequest.a);
        g.a(parcel, 2, resolveaccountrequest.a(), i);
        g.b(parcel, 3, resolveaccountrequest.b());
        g.q(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        int k = g.a(parcel);
        Account account = null;
        int i = 0;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    g.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = g.e(parcel, l);
                    break;

                case 2: // '\002'
                    account = (Account)g.a(parcel, l, Account.CREATOR);
                    break;

                case 3: // '\003'
                    j = g.e(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new ResolveAccountRequest(i, account, j);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new ResolveAccountRequest[i];
    }
}

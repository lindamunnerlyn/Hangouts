// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.RecordConsentRequest;

public final class fsb
    implements android.os.Parcelable.Creator
{

    public fsb()
    {
    }

    public static void a(RecordConsentRequest recordconsentrequest, Parcel parcel, int i)
    {
        int j = g.p(parcel, 20293);
        g.b(parcel, 1, recordconsentrequest.a);
        g.a(parcel, 2, recordconsentrequest.a(), i);
        g.a(parcel, 3, recordconsentrequest.b(), i);
        g.a(parcel, 4, recordconsentrequest.c());
        g.q(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        int j = g.a(parcel);
        Scope ascope[] = null;
        Account account = null;
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
                    i = g.e(parcel, k);
                    break;

                case 2: // '\002'
                    account = (Account)g.a(parcel, k, Account.CREATOR);
                    break;

                case 3: // '\003'
                    ascope = (Scope[])g.b(parcel, k, Scope.CREATOR);
                    break;

                case 4: // '\004'
                    s = g.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new RecordConsentRequest(i, account, ascope, s);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new RecordConsentRequest[i];
    }
}

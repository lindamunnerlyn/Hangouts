// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;

public final class epz
    implements android.os.Parcelable.Creator
{

    public epz()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        Account account = null;
        int l = g.a(parcel);
        android.os.Bundle bundle = null;
        Scope ascope[] = null;
        android.os.IBinder ibinder = null;
        String s = null;
        int j = 0;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    g.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = g.e(parcel, i1);
                    break;

                case 2: // '\002'
                    j = g.e(parcel, i1);
                    break;

                case 3: // '\003'
                    i = g.e(parcel, i1);
                    break;

                case 4: // '\004'
                    s = g.i(parcel, i1);
                    break;

                case 5: // '\005'
                    ibinder = g.j(parcel, i1);
                    break;

                case 6: // '\006'
                    ascope = (Scope[])g.b(parcel, i1, Scope.CREATOR);
                    break;

                case 7: // '\007'
                    bundle = g.k(parcel, i1);
                    break;

                case 8: // '\b'
                    account = (Account)g.a(parcel, i1, Account.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new GetServiceRequest(k, j, i, s, ibinder, ascope, bundle, account);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new GetServiceRequest[i];
    }
}

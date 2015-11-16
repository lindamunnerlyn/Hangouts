// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.CheckServerAuthResult;

public final class frs
    implements android.os.Parcelable.Creator
{

    public frs()
    {
    }

    public static void a(CheckServerAuthResult checkserverauthresult, Parcel parcel)
    {
        int i = g.p(parcel, 20293);
        g.b(parcel, 1, checkserverauthresult.a);
        g.a(parcel, 2, checkserverauthresult.b);
        g.c(parcel, 3, checkserverauthresult.c);
        g.q(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        int j = g.a(parcel);
        java.util.ArrayList arraylist = null;
        int i = 0;
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
                    flag = g.c(parcel, k);
                    break;

                case 3: // '\003'
                    arraylist = g.c(parcel, k, Scope.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new CheckServerAuthResult(i, flag, arraylist);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new CheckServerAuthResult[i];
    }
}

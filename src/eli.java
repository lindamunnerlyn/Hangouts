// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.auth.AccountChangeEvent;

public final class eli
    implements android.os.Parcelable.Creator
{

    public eli()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int i = 0;
        int l = g.a(parcel);
        long l1 = 0L;
        int j = 0;
        String s1 = null;
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
                    l1 = g.f(parcel, i1);
                    break;

                case 3: // '\003'
                    s1 = g.i(parcel, i1);
                    break;

                case 4: // '\004'
                    j = g.e(parcel, i1);
                    break;

                case 5: // '\005'
                    i = g.e(parcel, i1);
                    break;

                case 6: // '\006'
                    s = g.i(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new AccountChangeEvent(k, l1, s1, j, i, s);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new AccountChangeEvent[i];
    }
}

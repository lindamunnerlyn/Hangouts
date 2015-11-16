// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.googlehelp.OfflineSuggestion;

public final class fbq
    implements android.os.Parcelable.Creator
{

    public fbq()
    {
    }

    public static void a(OfflineSuggestion offlinesuggestion, Parcel parcel)
    {
        int i = g.p(parcel, 20293);
        g.b(parcel, 1, offlinesuggestion.a);
        g.a(parcel, 2, offlinesuggestion.b);
        g.a(parcel, 3, offlinesuggestion.c);
        g.a(parcel, 4, offlinesuggestion.d);
        g.a(parcel, 5, offlinesuggestion.e);
        g.q(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = g.a(parcel);
        int i = 0;
        String s1 = null;
        String s2 = null;
        String s3 = null;
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
                    s3 = g.i(parcel, k);
                    break;

                case 3: // '\003'
                    s2 = g.i(parcel, k);
                    break;

                case 4: // '\004'
                    s1 = g.i(parcel, k);
                    break;

                case 5: // '\005'
                    s = g.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new OfflineSuggestion(i, s3, s2, s1, s);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new OfflineSuggestion[i];
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;

public final class eok
    implements android.os.Parcelable.Creator
{

    public eok()
    {
    }

    public static FavaDiagnosticsEntity a(Parcel parcel)
    {
        int j = 0;
        int k = g.a(parcel);
        String s = null;
        int i = 0;
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
                    s = g.i(parcel, l);
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
                return new FavaDiagnosticsEntity(i, s, j);
            }
        } while (true);
    }

    public static void a(FavaDiagnosticsEntity favadiagnosticsentity, Parcel parcel)
    {
        int i = g.p(parcel, 20293);
        g.b(parcel, 1, favadiagnosticsentity.a);
        g.a(parcel, 2, favadiagnosticsentity.b);
        g.b(parcel, 3, favadiagnosticsentity.c);
        g.q(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return new FavaDiagnosticsEntity[i];
    }
}

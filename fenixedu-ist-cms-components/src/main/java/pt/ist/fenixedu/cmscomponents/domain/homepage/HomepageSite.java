/**
 * Copyright © 2013 Instituto Superior Técnico
 *
 * This file is part of FenixEdu IST CMS Components.
 *
 * FenixEdu IST CMS Components is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * FenixEdu IST CMS Components is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with FenixEdu IST CMS Components.  If not, see <http://www.gnu.org/licenses/>.
 */
package pt.ist.fenixedu.cmscomponents.domain.homepage;

import java.util.List;

import org.fenixedu.academic.domain.Person;
import org.fenixedu.bennu.core.domain.Bennu;
import org.fenixedu.bennu.core.groups.AnyoneGroup;
import org.fenixedu.bennu.core.groups.Group;
import org.fenixedu.bennu.core.groups.LoggedGroup;
import org.fenixedu.bennu.core.groups.UserGroup;
import org.fenixedu.cms.domain.DefaultRoles;
import org.fenixedu.cms.domain.Role;
import org.fenixedu.cms.domain.Site;
import org.fenixedu.commons.i18n.I18N;
import org.fenixedu.commons.i18n.LocalizedString;

import com.google.common.collect.ImmutableList;

import pt.ist.fenixframework.Atomic;
import pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate;

public class HomepageSite extends HomepageSite_Base {

    public HomepageSite(Site site){
        setSite(site);
    }


    public void delete() {
        deleteDomainObject();
    }

}
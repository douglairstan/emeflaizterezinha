﻿select p.pessoa_id, p.pessoa_nome, p.pessoa_dn, p.pessoa_sexo, rpe.cargo_nome, (extract(year from current_date) - extract(year from p.pessoa_dn)) as idade from pessoa p, registro_pessoa_empresa rpe WHERE (EXTRACT(MONTH FROM p.pessoa_dn) = 12) and p.pessoa_status = true and (p.pessoa_ci_uf, p.pessoa_ci_numero) = (rpe.pessoa_ci_uf, rpe.pessoa_ci_numero) and rpe.rpe_status = true and rpe.empresa_cnpj = '01611213000112' order by p.pessoa_dn, p.pessoa_nome